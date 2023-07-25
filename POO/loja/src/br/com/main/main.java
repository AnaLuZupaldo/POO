package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		//iniciando objeto
		veiculo carro = new veiculo();
		carro.nome = "Corsa";
		carro.cor = "Amarelo";
		carro.motor = "16cv";
		carro.velocidade = 100;
		carro.ligar();
		System.out.println("Nome: "+ carro.nome);
		System.out.println("Cor: "+ carro.cor);
		System.out.println("Motor: "+ carro.motor);
		System.out.println("Velocidade: "+ carro.velocidade);
		carro.desligar();
		
		System.out.println(" //Outro carro também ligou// ");
		
		carro.ligar();
		carro.nome = "Mobi";
		carro.cor = "Branco";
		carro.motor = "56cv";
		carro.velocidade = 220;
		System.out.println("Nome: "+ carro.nome);
		System.out.println("Cor: "+ carro.cor);
		System.out.println("Motor: "+ carro.motor);
		System.out.println("Velocidade: "+ carro.velocidade);
		carro.desligar();
		

	}

}
