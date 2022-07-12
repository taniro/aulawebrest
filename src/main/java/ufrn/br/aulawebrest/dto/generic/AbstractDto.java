package ufrn.br.aulawebrest.dto.generic;

import org.springframework.hateoas.RepresentationModel;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

public abstract class AbstractDto<E extends AbstractEntity> extends RepresentationModel<AbstractDto<E>> {
    public abstract E convertToEntity();
}