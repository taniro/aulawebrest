package ufrn.br.aulawebrest.controller.generic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.br.aulawebrest.dto.generic.AbstractDto;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;
import ufrn.br.aulawebrest.service.generic.AbstractService;

import java.util.List;
import java.util.stream.Collectors;

public class AbstractController <E extends AbstractEntity, S extends AbstractService, D extends AbstractDto<E>> implements IGenericController<D> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }








    @Override
    @GetMapping
    public List<D> findAll() {
        List<E> list = (List<E>) service.findAll();
        return list.stream().map( record -> (D) record.convertToDto())
                .collect(Collectors.toList());
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public D create(@RequestBody D dto) {
        E entity = (E)dto.convertToEntity();
        return (D) ((E)service.create(entity)).convertToDto();
    }

    @Override
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<D> findById(@PathVariable Long id) {

        return (ResponseEntity<D>) service.findById(id)
                .map(record -> ResponseEntity.ok().body( ((E) record).convertToDto()))
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    @PutMapping(value = "/{id}")
    public ResponseEntity<D> update(@PathVariable Long id, @RequestBody D dto) {

        E entity = dto.convertToEntity();
        entity.setId(id);

        return (ResponseEntity<D>) service.update(id, entity)
                .map( record ->ResponseEntity.ok().body( ((E) record).convertToDto() ))
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

}
