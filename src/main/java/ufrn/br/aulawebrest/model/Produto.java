package ufrn.br.aulawebrest.model;

import lombok.*;
import org.hibernate.Hibernate;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Produto extends AbstractEntity {
    String descricao;

    /*
    @ManyToMany(mappedBy = "produtos")
    @ToString.Exclude
    List<Pedido> pedidos;

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Produto produto = (Produto) o;
        return getId() != null && Objects.equals(getId(), produto.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}