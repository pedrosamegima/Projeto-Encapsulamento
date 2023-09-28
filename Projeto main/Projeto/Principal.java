package Projeto;

import ProjetoEndereco.Endereco;
import ProjetoCliente.Cliente;
import ProjetoItemTema.ItemTema;
import ProjetoTema.Tema;

public class Principal {

	public static void main(String[] args) {
		Tema tema1 = new Tema( 1,"Pedro", 800, "Azul");
		ItemTema itemTema1= new ItemTema(2,"David", "alto");
		Endereco endereco1 = new Endereco(3,"Av.Padre albuquerque", 45, "Avenida", "Vila regina", "Itapetininga","18208710","Sao Paulo");
		Cliente cliente1 = new Cliente(4,"Victor", "997212905", "865654856", "48451213");
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
		
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());
		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getNumero());
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		
		
	}

}
