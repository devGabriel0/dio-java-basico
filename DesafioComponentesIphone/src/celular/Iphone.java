package celular;

import componentes.aparelhoTelefonico.*;
import componentes.navegadorInternet.*;
import componentes.reprodutorMusical.*;

public class Iphone {
	
	public static void main(String[] args) {
		
		// Instanciando a classes especificas da interface AparelhoTelefonico.
		AparelhoTelefonico iniciarCorreio = new IniciarCorreioVoz();
		AparelhoTelefonico atenderAparelho = new AtenderAparelhoTelefonico();
		AparelhoTelefonico ligarAparelho = new LigarAparelhoTelefonico();
		
	
		iniciarCorreio.iniciarCorreioVoz();
		atenderAparelho.atender();
		ligarAparelho.ligar();
		
		System.out.println("\n+==================================+\n");

		// Instanciando a classes especificas da interface NavegadorInternet.
		NavegadorInternet exibirPagina = new ExibirPagina();
		NavegadorInternet atualizarPagina = new AtualizarPagina();
		NavegadorInternet adicionarPagina = new AdicionarNovaAba();
		
		exibirPagina.exibirPagina("Facebook");
		atualizarPagina.atualizarPagina();
		adicionarPagina.adicionarNovaAba();
		
		System.out.println("\n+==================================+\n");

		// Instanciando a classes especificas da interface ReprodutorMusical.
		ReprodutorMusical tocarMusica = new Tocar();
		ReprodutorMusical pausarMusica = new Pausar();
		ReprodutorMusical selecionarMusica = new SelecionarMusica();
		
		tocarMusica.tocar();
		pausarMusica.pausar();
		selecionarMusica.selecionarMusica("ADELE");
	}
	
}
