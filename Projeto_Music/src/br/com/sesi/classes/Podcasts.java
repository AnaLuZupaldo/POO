package br.com.sesi.classes;
import java.util.Scanner;

public class Podcasts extends Audio {
	
	Scanner scanner = new Scanner(System.in);

	
	private String apresentadores;
	
	private String descricaoPodcast;
	
	private String data;

	public String getApresentadores() {
		return apresentadores;
	}

	public void setApresentadores(String apresentadores) {
		this.apresentadores = apresentadores;
	}

	
	public String getDescricaoPodcast() {
		return descricaoPodcast;
	}

	public void setDescricaoPodcast(String descricaoPodcast) {
		this.descricaoPodcast = descricaoPodcast;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void showPodcastInfo() {
		System.out.println(" Digite o Título: ");
		setTitulo(scanner.nextLine());
		
		System.out.println(" Digite a duração: ");
		setDuracao(scanner.nextInt());
		
		System.out.println(" Digite quantas vezes ela será reproduzida: ");
		setReproducao(scanner.nextInt());
		
		System.out.println(" Digite quantas curtidas você gostaria de dar: ");
		setCurtidas(scanner.nextInt());
		
		System.out.println(" Digite uma classificação: ");
		setClassificacao(scanner.nextLine());
		
		System.out.println(" Digite o nome dos apresentadores: ");
		setApresentadores(scanner.nextLine());
		
		System.out.println(" Digite uma descrição do podcast: ");
		setDescricaoPodcast(scanner.nextLine());
		
		System.out.println(" Digite a data de publicação do podcast: ");
		setClassificacao(scanner.nextLine());
		
		
	}
	
	@Override
	public void showAudioInfo() {
		// TODO Auto-generated method stub
		super.showAudioInfo();
		System.out.println(" Apresentadores: " + apresentadores);
		
		System.out.println(" Descrição do episódio do podcast: " + descricaoPodcast);
		
		System.out.println(" Data da publicação: " + data);
		
	}
}
//Variaveis=apresentadores, descricao, data
//Metodos= override|showAudioInfo, showAudioInfo