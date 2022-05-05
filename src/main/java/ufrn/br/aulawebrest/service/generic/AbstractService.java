package ufrn.br.aulawebrest.service.generic;

import ufrn.br.aulawebrest.model.generic.AbstractEntity;
import ufrn.br.aulawebrest.repository.generic.GenericRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractEntity, R extends GenericRepository<E>> implements IGenericService<E>  {
    protected final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    /*
    @Override
    public List<E> findAll(
            @RequestParam(value = "_sort", defaultValue = "id") String sort,
            @RequestParam(value = "_start", defaultValue = "0") int page,
            @RequestParam(value = "_end", defaultValue = "10") int perPage,
            @RequestParam(value = "_order", defaultValue = "ASC") String order,
            @RequestParam(value = "q", defaultValue = "") String query
    ) {

        return SearchBuilder
                .usingRepository(repository)
                .filterBy(Collections.singletonList("name:>" + query))
                .sortBy(sort, order)
                .findAll(page, perPage);
    }
     */

    @Override
    public List<E> findAll(){
        return repository.findAll();
    }

    @Override
    public E create(E entity) {
        return  repository.save(entity);
    }

    @Override
    public Optional<E> findById(Long id) {
        return repository.findById(id);
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
