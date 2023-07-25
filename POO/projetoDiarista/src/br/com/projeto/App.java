package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		diarista.nome = "João da Silva";
		diarista.telefone = "(11) 98757-7859";
		diarista.endereco = "Av Cajamar, N 111";
		diarista.chavePix= "123";
		
		
		System.out.println(" Nome Diarista: " + diarista.endereco);
		System.out.println(" Nome Diarista: " + diarista.telefone);
		System.out.println(" Nome Diarista: " + diarista.endereco);
		System.out.println(" Pix : " + diarista.chavePix);
		diarista.atender("José");
		
		System.out.println("===========================");
		Cliente cliente = new Cliente();
		cliente.nome = "José";
		cliente.telefone = "(11) 98757-7859";
		cliente.endereco = "Av Jundiai, N 11";
		cliente.saldo = 100;
		
		System.out.println(" Nome do cliente: " + cliente.nome);
		System.out.println(" Nome do cliente: " + cliente.telefone);
		System.out.println(" Nome do cliente: " + cliente.endereco);
		System.out.println(" Saldo: " + cliente.saldo);
		
		
		
	
	}

}
