package br.com.sesi.classes;
import java.util.*;
// o audio é a minha classe pai, logo minhas classes filhos herdarao tudo dele
public class Audio {
	
	Scanner scanner = new Scanner(System.in);
	

	protected String titulo;
	
	protected int duracao;
	
	protected int totalDeReproducao;
	
	protected int curtidas;
	
	protected String classificacao;
	
	protected int voltar;
	
	protected int reproducao;
	

	public int getReproducao() {
		return reproducao;
	}

	public void setReproducao(int reproduzir) {
		this.reproducao = reproduzir;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getTotalDeReproducao() {
		return totalDeReproducao;
	}

	public void setTotalDeReproducao(int totalDeReproducao) {
		this.totalDeReproducao = totalDeReproducao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	//Metodos 
	
	

	public void showAudioInfo() {
		
		System.out.println(" Título: " + getTitulo());
		
		System.out.println(" Duração: " + getDuracao() + " minutos ");
		
		System.out.println(" Reproduzir: " + getReproducao());
		
		System.out.println(" Curtidas: " + getCurtidas() + " ♥ ");
		
		System.out.println(" Classificação: " + getClassificacao());
		
		System.out.println(" Total de reproduções: " + getTotalDeReproducao());
		
		
	}
	
	public void curtir() {
		
		curtidas++;
	
	  
		
	}
	
	public void reproduzir() {
		reproducao++;
		totalDeReproducao = reproducao;
	}
	
	
	
		
		
		
	}


/// o que eu vou ter no 
//Variaveis=titulo,duracao,total de reproducao,curtidas, classificacao,gêneros,artista
// Metodos= curtir, reproduzir