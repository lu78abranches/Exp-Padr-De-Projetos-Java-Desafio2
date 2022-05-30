package dio.desafio.finall.facade;

import subsistema.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade();
		String estado = CepApi.getInstancia().recuperarEstado();
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
