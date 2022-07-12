package ufrn.br.aulawebrest.controller.generic;

import org.springframework.http.ResponseEntity;
import ufrn.br.aulawebrest.dto.generic.AbstractDto;

import java.util.List;

public interface IGenericController <D extends AbstractDto>{

    //List<E> findAll(String sort, int page, int perPage, String order, String query);
    List<D> findAll();
    D create(D entity);
    ResponseEntity<D> findById(Long id);
    ResponseEntity<D> update(Long id, D entity);
    ResponseEntity<?> delete(Long id);
}
