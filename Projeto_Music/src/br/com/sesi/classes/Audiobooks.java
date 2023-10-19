package br.com.sesi.classes;
import java.util.Scanner;

public class Audiobooks extends Audio {
	
	Scanner scanner = new Scanner(System.in);

	private String escritor;
	
	private int episodios ;
	
	private int capitulo;
	
	private String descricao;
	
	private String dataBook;

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public int getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDataBook() {
		return dataBook;
	}

	public void setDataBook(String dataBook) {
		this.dataBook = dataBook;
	}

	@Override
	public void showAudioInfo() {
		// TODO Auto-generated method stub
		super.showAudioInfo();
		System.out.println(" Nome do escritor: " + getEscritor());
		
		System.out.println(" Número do episódio: " + getEpisodios());
		
		System.out.println(" Número do capítulo: " + getCapitulo());
		
		System.out.println(" Descrição do capítulo do livro: " + getDescricao());
		
		System.out.println(" Data de publicação do episódio: " + getDataBook());
	}
	
public void showAudiobookInfo() {
		
		
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
		
		System.out.println(" Digite o número do episódio: ");
		setEpisodios(scanner.nextInt());
		
		System.out.println(" Digite o nome do escritor: ");
		setEscritor(scanner.nextLine());
		
		System.out.println(" Digite o número do capítulo: ");
		setCapitulo(scanner.nextInt());
		
		System.out.println(" Digite a descrição do episódio: ");
		setDescricao(scanner.nextLine());
		
		System.out.println(" Digite a data de publicação: ");
		setDataBook(scanner.nextLine());
		
		
	}
}
//Variaveis= escritor,episodios, capitulo,descricao,data

//Metodos= mostar informacoes das variaveis+ override showAudioInfo
