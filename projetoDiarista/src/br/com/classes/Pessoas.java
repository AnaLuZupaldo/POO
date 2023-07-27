package br.com.classes;
import br.com.classes.interfaces.*;

public abstract class Pessoas implements Isaldo {
	protected String nome;
	protected String telefone;
	private double saldo;
	protected String endereco;

	public double getSaldo() {
		return saldo;
	}

	public  void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
