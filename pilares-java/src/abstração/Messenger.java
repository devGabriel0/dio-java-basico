package abstração;

public class Messenger {
	public static void main(String[] args) {
		
		BackMessenger e = new BackMessenger();
		
		e.enviarMensagem();
		e.receberMensagem();
		
		BackFacebook fb = new BackFacebook();
		fb.enviarMensagem();
		fb.receberMensagem();
	}
}
