package ufrn.br.aulawebrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ufrn.br.aulawebrest.model.Cliente;
import ufrn.br.aulawebrest.model.Endereco;
import ufrn.br.aulawebrest.repository.ClienteRepository;
import ufrn.br.aulawebrest.repository.EnderecoRepository;

import javax.transaction.Transactional;


@Component
@Transactional
public class RunMyCode implements ApplicationRunner {

    /*
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;


     */
    @Override
    public void run(ApplicationArguments args) throws Exception {



        /*
        Cliente c1 = new Cliente();
        Endereco e1 = new Endereco();

        c1.setNome("teste");

        c1.setEndereco(e1);
        e1.setCliente(c1);

         */


        /*
        //Exemplo slide 1
        e1.setRua("Natal");
        clienteRepository.save(c1);
        enderecoRepository.save(e1);

         */




		/*
		//Exemplo slide 2
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		enderecoRepositoty.save(e1);
		 */



		/*
		//Exemplo slide 3
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		clienteRepository.save(c1);/*
		/*
		//Exemplo slide 4
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		enderecoRepositoty.save(e1);
		clienteRepository.save(c1);
		 */

		/*
		//Exemplo slide 5
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		enderecoRepositoty.save(e1);
		clienteRepository.save(c1);
		clienteRepository.delete(c1);
		*/


		/*
		//Exemplo slide 3 Após cascade
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		clienteRepository.save(c1);
		 */

		/*
		//Exemplo problema de integridade
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		clienteRepository.save(c1);
		clienteRepository.delete(c1);
		 */

		/*
		//Exemplo problema de integridade
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		clienteRepository.save(c1);
		enderecoRepositoty.delete(e1);
		 */


		/*
		//Exemplo problema de integridade
		c1.setNome("Taniro");
		e1.setRua("Natal");
		e1.setCliente(c1);
		c1.setEndereco(e1);
		clienteRepository.save(c1);
		c1.setEndereco(null);
		clienteRepository.save(c1);
		 */

		/*c1.setNome("Taniro");
		e1.setRua("Natal");
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		c1.setEndereco(null);
		clienteRepository.save(c1);*/



		/*
		//Caso 1
		c1.setEndereco(e1);
		e1.setCliente(c1);
		enderecoRepositoty.save(e1);
		 */


		/*
		//Caso 2
		enderecoRepositoty.save(e1);
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		 */

		/*
		//Caso 3
		enderecoRepositoty.save(e1);
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		 */

		/*
		//Caso 4
		enderecoRepositoty.save(e1);
		c1.setEndereco(e1);
		e1.setCliente(c1);
		clienteRepository.save(c1);
		 */



		/*
		//Cliente e Pedidos
		Cliente c1 = new Cliente();
		c1.setNome("João");
		Endereco e1 = new Endereco();
		e1.setRua("Lagoa");
		c1.setEndereco(e1);
		e1.setCliente(c1);
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();
		p1.setDataPedido("pedido1");
		p2.setDataPedido("pedido2");
		p3.setDataPedido("pedido3");
		List<Pedido> pedidos = new ArrayList<>();
		pedidos.add(p1);
		pedidos.add(p2);
		pedidos.add(p3);
		c1.setPedidos(pedidos);
		clienteRepository.save(c1);
		p1.setCliente(c1);
		p2.setCliente(c1);
		p3.setCliente(c1);
		clienteRepository.save(c1);
		*/
        //pedidoRepository.save(p2);
        //pedidoRepository.save(p3);


        //c1.setPedidos(pedidos);




        /*
		//fetch tests
		Cliente c2 = clienteRepository.getOne((long) 1);
		System.out.println(c2.getNome());
		System.out.println(c2.getEndereco().getRua());
		//System.out.println(c1.getPedidos().get(1).toString());

         */



	/*
		//Many to Many
		Cliente c1 = new Cliente();
		c1.setNome("pedro");
		Endereco e1 = new Endereco();
		e1.setRua("jundiai");
		c1.setEndereco(e1);
		e1.setCliente(c1);
		Pedido o = new Pedido();
		o.setDataPedido("hoje");
		List<Pedido> pedidoList = new ArrayList<>();
		pedidoList.add(o);
		o.setCliente(c1);
		c1.setPedidos(pedidoList);
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		p1.setDescricao("produto 1");
		p2.setDescricao("produto 2");
		p3.setDescricao("produto 3");
		p1.setPedidos(pedidoList);
		p2.setPedidos(pedidoList);
		p3.setPedidos(pedidoList);
		List<Produto> produtoList = new ArrayList<>();
		produtoList.add(p1);
		produtoList.add(p2);
		produtoList.add(p3);
		o.setProdutos(produtoList);
		clienteRepository.save(c1);
	 */
    }
}
