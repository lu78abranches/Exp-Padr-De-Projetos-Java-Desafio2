package desafio.dio.gtf5.labpadroesprojetospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {
	
	

    public Cliente(Long id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
    	
    	return "ID: " + this.id + System.lineSeparator() + "Nome: " + this.nome + System.lineSeparator() +
    			"Endereço: " + System.lineSeparator() + "Rua " + this.endereco.getLogradouro() +
    			System.lineSeparator() + "Complemento: " + this.endereco.getComplemento() + System.lineSeparator() +
    			"Bairro: " + this.endereco.getBairro() + System.lineSeparator() + "Cidade: " + this.endereco.getLocalidade()
    			+ System.lineSeparator() + "Estado: " + this.endereco.getUf();
    }

	
		
	}
