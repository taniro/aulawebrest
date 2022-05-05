package ufrn.br.aulawebrest.model;

import lombok.*;
import org.hibernate.Hibernate;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Endereco extends AbstractEntity {

    String rua;

    @OneToOne(mappedBy = "endereco")
    Cliente cliente;


    /*
    //Caso 1
    @OneToOne
    @MapsId
    @JoinColumn(name = "cliente_id")
    Cliente cliente;
     */
    /*
	//Caso 2
	@OneToOne(mappedBy = "endereco")
	Cliente cliente;
     */
    /*
	//Caso 3
	@OneToOne
	@JoinColumn(name = "cliente_id")
	Cliente cliente;
    */
	/*
	//Caso 4
	@OneToOne
	@JoinColumn(name = "cliente_id")
	Cliente cliente;
	 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Endereco endereco = (Endereco) o;
        return getId() != null && Objects.equals(getId(), endereco.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}