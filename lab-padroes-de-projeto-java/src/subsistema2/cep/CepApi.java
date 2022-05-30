package subsistema2.cep;

import dio.desafio.finall.singleton.SingletonEager;

public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	private  CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade() {
		return "Mairinque";
		
	}
	
	public String recuperarEstado() {
		return "São Paulo";
		
	}

}
