package com.anderson.test;

import com.anderson.carro.Carro;
import com.anderson.controller.Acao;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Acao acao = new Acao();
		carro.setNome("Heinz");
		carro.setAno(2031);
		acao.start(1);
		acao.destino(1);

	}

}
