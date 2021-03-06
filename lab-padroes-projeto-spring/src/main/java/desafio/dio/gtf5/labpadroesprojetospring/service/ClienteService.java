package desafio.dio.gtf5.labpadroesprojetospring.service;

import desafio.dio.gtf5.labpadroesprojetospring.model.Cliente;


public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);

}
