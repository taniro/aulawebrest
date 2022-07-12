package ufrn.br.aulawebrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.aulawebrest.controller.generic.AbstractController;
import ufrn.br.aulawebrest.dto.EnderecoDto;
import ufrn.br.aulawebrest.model.Endereco;
import ufrn.br.aulawebrest.service.EnderecoService;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController extends AbstractController<Endereco, EnderecoService, EnderecoDto>{
    public EnderecoController(EnderecoService service){
        super(service);
    }
}

