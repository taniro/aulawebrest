package ufrn.br.aulawebrest.service;

import org.springframework.stereotype.Service;
import ufrn.br.aulawebrest.model.Cliente;
import ufrn.br.aulawebrest.repository.ClienteRepository;
import ufrn.br.aulawebrest.service.generic.AbstractService;

@Service
public class ClienteService extends AbstractService<Cliente, ClienteRepository> {
    public ClienteService(ClienteRepository repository) {
        super(repository);
    }


}
