package desafio.dio.gtf5.labpadroesprojetospring.model;


public class NovoCliente {

		
		static Endereco enderecoCliente1 = new Endereco("02455010", "Goias, 23", 
				"Ap 123", "Parque da Salvação", "São Paulo", "SP" );
		
		static Cliente cliente1 = new Cliente((long) 55, "Carlos Roberto", enderecoCliente1);
		
		static Endereco enderecoCliente2 = new Endereco("15698254", "da Bica, 55", "Ap 234",
				"Jd.Primavera", "São Vicente", "SP");
		
		static Cliente cliente2 = new Cliente((long) 12432, "João Cabuloso", enderecoCliente2);
		
		static Endereco enderecoCliente3 = new Endereco("25897845", "da Varzea, 35", "Ap 985",
				"Jd.Conceição", "Belo Horizonte", "MG");
		
		static Cliente cliente3 = new Cliente((long) 12432, "Ana Nascimento", enderecoCliente3);
		
		
	

}
