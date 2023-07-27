package br.com.projeto;

import br.com.classes.*;


public class App {

	public static void main(String[] args) {
	
		Diarista diarista = new Diarista();
		
		diarista.setNome("João da Silva");
		diarista.setTelefone("(11) 98757-7859");
		diarista.setEndereco("Av Cajamar, N 111");
		diarista.setChavePix("123");
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone Diarista: " + diarista.getTelefone());
		System.out.println("Endereço Diarista: " + diarista.getEndereco());
		diarista.atender("José");
		diarista.depositar(20);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		diarista.sacar(10);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		
		System.out.println("====================================================================");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Denis ");
		cliente.setTelefone("(11) 98568-8974");
		cliente.setEndereco( "Rua das Américas");
		cliente.setSaldo(0);
		
		
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereço Cliente: " + cliente.getEndereco());
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		cliente.sacar(14);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		
		System.out.println("======================================================================");
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(5);
		System.out.println(atendimento.getHoras());
						
	}

}
