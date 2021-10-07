package com.anderson.controller;

public class Acao {
	private int ligar;
	private int localizacao;
	
	public int getLigar() {
		return ligar;
	}

	public void setLigar(int ligar) {
		this.ligar = ligar;
	}

	public boolean start(int ligar) {
		if(ligar == 1) {
			System.out.println("Carro ligou");
			System.out.println("Insira o destino");
			return true;
		}
		return false;
	}
	
	public boolean destino (int localizacao) {
		if(localizacao == 1) {
			System.out.println("Localização inserida com sucesso!");
			System.out.println("O carro iniciará seu trajeto de acordo com a melhor rota e menor transito, boa viajem!");
			return true;
		}
		return false;
	}

}
