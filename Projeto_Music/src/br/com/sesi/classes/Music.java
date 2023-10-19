package br.com.sesi.classes;
import java.util.Scanner;

public class Music extends Audio {
	
	Scanner scanner = new Scanner(System.in);
	
	private String lyrics;
	
	private String artista;
	
	private String album;
	
	private String genero;
	
	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}


	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void showMusicInfo() {
		
		
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
		
		System.out.println(" Digite o total de reproduções: ");
		setTotalDeReproducao(scanner.nextInt());
		
		System.out.println(" Digite o nome do artista: ");
		setArtista(scanner.nextLine());
		
		System.out.println(" Digite o nome do album: ");
		setAlbum(scanner.nextLine());
		
		System.out.println(" Digite o gênero do música: ");
		setGenero(scanner.nextLine());
		
		System.out.println(" Digite um trecho dessa música: ");
		setLyrics(scanner.nextLine());
		
		
	}

	@Override
	public void showAudioInfo() {
		// TODO Auto-generated method stub
		super.showAudioInfo();
		System.out.println(" Letra da música: " + getLyrics());
		
		System.out.println(" Nome do artista: " + getArtista());
		
		System.out.println(" Nome do album: " + getAlbum());
		
		System.out.println(" Gênero da música: " + getGenero());
	}

}
//Variavesis= letra,genero

// Metodos=  mostrar as informacoes da classe music+override shoeAudioInfo