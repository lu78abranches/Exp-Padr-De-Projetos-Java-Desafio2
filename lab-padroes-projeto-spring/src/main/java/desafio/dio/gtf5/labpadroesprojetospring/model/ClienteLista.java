package desafio.dio.gtf5.labpadroesprojetospring.model;


import java.util.ArrayList;

public class ClienteLista extends NovoCliente {

	public static void main(String[] args) {
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		
		System.out.println("Quantos Clientes tem na lista: " + listaClientes.size() + System.lineSeparator());
		Cliente ref = listaClientes.get(0);
		
		
		for(Cliente cliente : listaClientes) {
			System.out.println(cliente + System.lineSeparator());
		

		}
		
	}

}
