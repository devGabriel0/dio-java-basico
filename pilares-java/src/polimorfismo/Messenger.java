package polimorfismo;

import appPolimorfismo.*;

public class Messenger {
	public static void main(String[] args) {
		
		ServicoMensagem mi = null;
		
//		Não se sabe qual app
//		Mas qualquer um deverá enviar e receber mensagem.
		
		String appEscolhido = "tl";
		
		if(appEscolhido.equals("ms")) {
			mi = new BackMessenger();
		}else if(appEscolhido.equals("fb")) {
			mi = new BackFacebook();
			
		}else if(appEscolhido.equals("tl")) {
			mi = new BackTelegram();
		}
		
		mi.enviarMensagem();
		mi.receberMensagem();
//		BackMessenger e = new BackMessenger();
//		
//		e.enviarMensagem();
//		e.receberMensagem();
//		
//		BackFacebook fb = new BackFacebook();
//		fb.enviarMensagem();
//		fb.receberMensagem();
	}
}
