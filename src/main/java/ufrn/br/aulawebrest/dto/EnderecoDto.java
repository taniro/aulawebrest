package ufrn.br.aulawebrest.dto;

import lombok.Data;
import ufrn.br.aulawebrest.controller.EnderecoController;
import ufrn.br.aulawebrest.dto.generic.AbstractDto;
import ufrn.br.aulawebrest.model.Endereco;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Data
public class EnderecoDto extends AbstractDto<Endereco> {

    String rua;

    public EnderecoDto(){
        this.add(linkTo(EnderecoController.class).withRel("allEnderecos"));
    }

    @Override
    public Endereco convertToEntity() {
        return new Endereco(this.rua);
    }
}