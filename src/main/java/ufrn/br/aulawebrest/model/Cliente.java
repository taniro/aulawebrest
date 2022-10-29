package ufrn.br.aulawebrest.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.aulawebrest.model.generic.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends AbstractEntity {

    @NotBlank(message = "Nome não pode estar em branco ou vazio.")
    String nome;

    /*
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "cliente")
    List<Pedido> pedidos;

     */

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

}
