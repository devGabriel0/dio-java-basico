package appPolimorfismo;

public class BackFacebook extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		validandoConexaoInternet();
		System.out.println("Enviando mensagem pelo Facebook.");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook.");
		
	}

	
	
}
