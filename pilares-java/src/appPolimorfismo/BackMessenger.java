package appPolimorfismo;

public class BackMessenger extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		validandoConexaoInternet();
		System.out.println("Enviando mensagem pelo Messenger.");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Messenger.");
		
	}

	
}
