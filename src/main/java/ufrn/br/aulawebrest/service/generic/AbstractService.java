package ufrn.br.aulawebrest.service.generic;

import ufrn.br.aulawebrest.model.generic.AbstractEntity;
import ufrn.br.aulawebrest.repository.generic.GenericRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractEntity, R extends GenericRepository<E>> implements IGenericService<E>  {
    protected final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> findAll(){
        return repository.findAll();
    }

    @Override
    public E create(E entity) {
        return  repository.save(entity);
    }

    @Override
    public E findById(Long id) {
        Optional<E> entity = repository.findById(id);
        if (entity.isPresent()){
            return entity.get();
        }else{
            throw new EntityNotFoundException("Entity with id "+ id+ " was not found in the server.");
        }
    }

    @Override
    public Optional<E> update(Long id,E entity) {
        return repository
                .findById(id)
                .map(record -> {
                    repository.saveAndFlush(entity);
                    return record;
                });
    }

    @Override
    public Boolean delete(Long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return true;
                }).orElse(false);
    }
}
