package ufrn.br.aulawebrest.repository;

import ufrn.br.aulawebrest.model.Cliente;
import ufrn.br.aulawebrest.model.Endereco;
import ufrn.br.aulawebrest.repository.generic.GenericRepository;

public interface ClienteRepository extends GenericRepository<Cliente> {
    Cliente findClienteByNome(String nome);
    Cliente findClienteByEnderecoAndNome(Endereco endereco, String nome);
}
