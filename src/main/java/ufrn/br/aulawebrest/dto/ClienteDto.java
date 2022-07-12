package ufrn.br.aulawebrest.dto;

import lombok.Data;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import ufrn.br.aulawebrest.controller.ClienteController;
import ufrn.br.aulawebrest.dto.generic.AbstractDto;
import ufrn.br.aulawebrest.model.Cliente;
import ufrn.br.aulawebrest.model.Endereco;
import ufrn.br.aulawebrest.model.Pedido;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Data
public class ClienteDto extends AbstractDto<Cliente> {

    String nome;
    Endereco endereco;
    List<Pedido> pedidos;

    public ClienteDto(){
        this.add(linkTo(ClienteController.class).withRel("allClientes"));
    }

    @Override
    public Cliente convertToEntity() {
        return new Cliente(this.nome, this.endereco, this.pedidos);
    }
}
