package desafio.dio.gtf5.labpadroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import desafio.dio.gtf5.labpadroesprojetospring.model.Endereco;


@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	
	@GetMapping(";/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);

}
