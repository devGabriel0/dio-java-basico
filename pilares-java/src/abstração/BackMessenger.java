package abstração;

public class BackMessenger extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Messenger.");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Messenger.");
		
	}

	
}
