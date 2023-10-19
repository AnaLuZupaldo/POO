package br.com.sesi.app;
import br.com.sesi.classes.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		Music music = new Music();
		
		Audiobooks audiobooks = new Audiobooks();
		
		Podcasts podcast = new Podcasts();
		
		boolean ativa = true;
		 int opcao;
		while (ativa==true) {
			
			System.out.println("***************************** App de reprodução de aúdio ***************************************");
			System.out.println("Digite |1| para escolher uma música ");
			System.out.println("Digite |2| para escolher um audiobook ");
			System.out.println("Digite |3| para escolher um podcast ");
			System.out.println("Digite |4| para sair");
			System.out.println("   Digite o número:  ");
			
		  
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1: 
				music.showMusicInfo();
				music.showAudioInfo();
				music.curtir();
				music.curtir();
				music.reproduzir();
				music.reproduzir();
			
				
				
				break;
				
			case 2: 
				audiobooks.showAudiobookInfo();
				podcast.showAudioInfo();
				audiobooks.curtir();
				audiobooks.curtir();
				audiobooks.reproduzir();
				audiobooks.reproduzir();
				
				break;
				
			case 3: 
				podcast.showPodcastInfo();
				podcast.showAudioInfo();
				podcast.curtir();
				podcast.curtir();
				podcast.reproduzir();
				podcast.reproduzir();
				
				
				
				break;
				
			case 4: 
				ativa=false;
				System.out.println(" Você saiu do programa ");
				
				break;
			   
			default:
				System.out.println("Ação não encontrada");
				break;
			
			}
			
			
			
		}
		
	
		
		
		
	}

}
