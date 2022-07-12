package ufrn.br.aulawebrest.service;

import org.springframework.stereotype.Service;
import ufrn.br.aulawebrest.model.Cliente;
import ufrn.br.aulawebrest.model.Endereco;
import ufrn.br.aulawebrest.repository.ClienteRepository;
import ufrn.br.aulawebrest.repository.EnderecoRepository;
import ufrn.br.aulawebrest.service.generic.AbstractService;


@Service
public class EnderecoService extends AbstractService<Endereco, EnderecoRepository> {
    public EnderecoService(EnderecoRepository repository) {
        super(repository);
    }
}