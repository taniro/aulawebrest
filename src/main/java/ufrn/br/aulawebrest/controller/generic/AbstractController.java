package ufrn.br.aulawebrest.controller.generic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;
import ufrn.br.aulawebrest.service.generic.AbstractService;

import java.util.List;
import java.util.Optional;

public class AbstractController <E extends AbstractEntity, S extends AbstractService> implements IGenericController<E> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }

    /*
    @Override
    @GetMapping
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
    @GetMapping
    public List<E> findAll() {
        return service.findAll();
    }

    @Override
    @PostMapping
    public E create(@RequestBody E entity) {
        return (E) service.create(entity);
    }

    @Override
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<E> findById(@PathVariable Long id) {
        return  ResponseEntity.ok().body( (E) service.findById(id));
        /*
        try {
            return  ResponseEntity.ok().body( (E) service.findById(id));
        }catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found", e);
        }
        */
        /*
        return (ResponseEntity<E>) service.findById(id)
                .map(record -> ResponseEntity.ok().body( (E) record))
                .orElse(ResponseEntity.notFound().build());*/
    }

    @Override
    @PutMapping(value = "/{id}")
    public ResponseEntity<E> update(@PathVariable Long id, @RequestBody E entity) {

        return (ResponseEntity<E>) service.update(id, entity)
                .map( record ->ResponseEntity.ok().body((E) record ))
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (service.delete(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
