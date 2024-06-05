
public class EstruturaComposta {

	public static void main(String[] args) {
		
		double saldo = 29.5;
		double valorSolicitado = 10;
		
		if (valorSolicitado <= saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println(saldo);
		} else {
			System.out.println("Saldo insuficente.");
		}
		
	}
	
}
