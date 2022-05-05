package ufrn.br.aulawebrest.service.generic;

import ufrn.br.aulawebrest.model.generic.AbstractEntity;

import java.util.List;
import java.util.Optional;

public interface IGenericService <E extends AbstractEntity>  {
    //List<E> findAll(String sort, int page, int perPage, String order, String query);
    List<E> findAll();
    E create(E entity);
    Optional<E> findById(Long id);
    Optional<E> update(Long id, E entity);
    Boolean delete(Long id);
}
