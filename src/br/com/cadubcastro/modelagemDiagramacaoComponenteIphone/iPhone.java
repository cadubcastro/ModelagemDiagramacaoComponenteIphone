package br.com.cadubcastro.modelagemDiagramacaoComponenteIphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	boolean musicaSelecionada;
	String musica;

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando endereço: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba na Janela");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("::F5::");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Iniciando chamada telefônica para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void tocar() {
		if(musicaSelecionada) {
			System.out.println("Play - Tocando musica");
		} else {
			System.out.println("Necessário selecionar música para tocar");
		}
		
	}

	@Override
	public void pausar() {
		if(musicaSelecionada) {
			System.out.println("Pauser - pausando musica");
		} else {
			System.out.println("nenhuma música selecionada");
		}		
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Música selecionada: " + musica);
		this.musicaSelecionada = true;
		
	}

}
