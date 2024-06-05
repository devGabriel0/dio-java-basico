
public class Metodos {

	public double somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public void imprimir(String texto) {
		// Não há necessidade de haver um return, pois nesse método não retornará nenhum resultado.
		
	}
	
	// throws Exception = Indica que o método a ser utilizado poderá gerar uma exceção 
	
	public double divisao(int dividendo, int divisor) throws Exception{
		return dividendo / divisor;
	}
	
	// Método "private" não pode ser visto por outras classes no projeto.
	private void metodoPrivado() {	}
	
	
	
	
}
