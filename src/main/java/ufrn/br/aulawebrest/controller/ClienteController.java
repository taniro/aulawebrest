package ufrn.br.aulawebrest.controller;

import org.springframework.web.bind.annotation.*;
import ufrn.br.aulawebrest.controller.generic.AbstractController;
import ufrn.br.aulawebrest.dto.ClienteDto;
import ufrn.br.aulawebrest.model.Cliente;
import ufrn.br.aulawebrest.service.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController extends AbstractController<Cliente, ClienteService, ClienteDto> {
    public ClienteController(ClienteService service){
        super(service);
    }
}