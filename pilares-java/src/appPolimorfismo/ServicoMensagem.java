package appPolimorfismo;

public abstract class ServicoMensagem {

	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	protected void validandoConexaoInternet() {
		System.out.println("Validando conexão com a internet");
	}
	
}
