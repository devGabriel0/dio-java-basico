package abstração;

public class BackFacebook extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook.");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook.");
		
	}

	
	
}
