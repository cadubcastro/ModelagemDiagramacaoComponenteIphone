package br.com.cadubcastro.modelagemDiagramacaoComponenteIphone;

public class AparelhoTeste {

	public static void main(String[] args) {
		
		iPhone iphPhone = new iPhone();
		
		iphPhone.tocar();
		iphPhone.selecionarMusica("Maravilhosa (Ao Vivo - Zé Vaqueiro)");
		iphPhone.tocar();
		iphPhone.pausar();
		
		System.out.println("---");
		
		iphPhone.ligar("61 999998877");
		iphPhone.atender();
		iphPhone.iniciarCorreioVoz();
		
		System.out.println("---");
		
		iphPhone.exibirPagina("https://web.dio.me");
		iphPhone.adicionarNovaAba();
		iphPhone.atualizarPagina();

	}

}
