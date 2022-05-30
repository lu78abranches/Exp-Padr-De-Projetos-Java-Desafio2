package dio.desafio.finall;

import dio.desafio.finall.facade.Facade;
import dio.desafio.finall.singleton.SingletonEager;
import dio.desafio.finall.singleton.SingletonLazy;
import dio.desafio.finall.singleton.SingletonLazyHolder;
import dio.desafio.finall.strategy.Comportamento;
import dio.desafio.finall.strategy.ComportamentoAgressivo;
import dio.desafio.finall.strategy.ComportamentoDefensivo;
import dio.desafio.finall.strategy.ComportamentoNormal;
import dio.desafio.finall.strategy.Robo;

public class Test {
	
	public static void main(String[] args) {
		
		//testes relacionados ao design patters singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		//testes relacionados ao design patters strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facede
		
		Facade facade = new Facade();
		facade.migrarCliente("Luis", "02366999");
		
	}

}
