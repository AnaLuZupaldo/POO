package br.com.classes;

public class Cliente extends Pessoas {
	

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
		var novoSaldo = saldoAtual + (valor + (valor/100)*10);
		this.setSaldo(novoSaldo);
		
	}
	
	
}


