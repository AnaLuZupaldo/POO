package br.com.classes;

public class Diarista extends Pessoas{
	
	protected String chavePix;

	public String getChavePix() {
		return chavePix;
	}


	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	

	public void atender(String nomeCliente) {
	
		System.out.println("Realizando atendimento para cliente: " + nomeCliente);
		
		
    }


	@Override
	public void sacar(float valor) {
		// TODO Auto-generated method stub
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
		
	}


	@Override
	public void depositar(float valor) {
		// TODO Auto-generated method stub
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor;
		this.setSaldo(novoSaldo);
		
	}
	
}