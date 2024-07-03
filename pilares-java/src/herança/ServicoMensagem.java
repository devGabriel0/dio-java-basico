package herança;

public class ServicoMensagem {

	public void enviarMensagem() {
		verificarInternet();
		System.out.println("Mensagem enviada.");
		salvarHistorico();
	}
	
	private void verificarInternet() {
		System.out.println("Internet verificada.");
	}
	
	private void salvarHistorico() {
		System.out.println("Histórico de mensagem salvo.");
	}
	
	public void receberMensagem() {
		System.out.println("Mensagem recebida.");
	}
	
}
