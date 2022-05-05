package ufrn.br.aulawebrest.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

public interface GenericRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
