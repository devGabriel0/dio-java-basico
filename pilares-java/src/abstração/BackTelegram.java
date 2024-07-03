package abstração;

public class BackTelegram extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram.");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram.");
		
	}


	
}
