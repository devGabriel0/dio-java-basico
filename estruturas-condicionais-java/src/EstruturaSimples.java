
public class EstruturaSimples {

	public static void main(String[] args) {
		
		double saldo = 24.5;
		double valorSolicitado = 120;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Valor do saldo atual: " + saldo);
		}
		
	}
	
	/*
	 * Sera verificado se o valor solicitado é menor que o saldo atual, caso seja menor será feito uma subtração de saldo e valorSolicitado
	 * Caso o valor seja maior que o saldo, não será exibido nada.
	 */
	
}
