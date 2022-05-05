package ufrn.br.aulawebrest.model;

import lombok.*;
import org.hibernate.Hibernate;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Empregado extends AbstractEntity {

	@OneToOne
	@JoinColumn(name = "chefe_id")
	Empregado chefe;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Empregado empregado = (Empregado) o;
		return getId() != null && Objects.equals(getId(), empregado.getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}