package encapsulamento;

public class Messenger {
	public static void main(String[] args) {
		
		BackMessenger e = new BackMessenger();
		
		e.enviarMensagem();
		e.receberMensagem();
	}
}
