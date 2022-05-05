package ufrn.br.aulawebrest.model;

import lombok.*;
import org.hibernate.Hibernate;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Cliente extends AbstractEntity {

    String nome;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "endereco_id")
    Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "cliente")
    @ToString.Exclude
    List<Pedido> pedidos;

    //Outras opções de mapeamento não utilizadas
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
     */
    /*
    //Caso 1
    @OneToOne(mappedBy = "cliente")
    Endereco endereco;
     */
    /*
    //Caso 2
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "endereco_id")
    Endereco endereco;
    */
    /*
	//Caso 3
	@OneToOne(mappedBy = "cliente")
	Endereco endereco;
     */
	/*
	//Caso 4
	@OneToOne
	@JoinColumn(name ="endereco_id")
	Endereco endereco;
	 */
    /*
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "cliente")
    List<Pedido> pedidos;
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return getId() != null && Objects.equals(getId(), cliente.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
