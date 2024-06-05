import java.util.Scanner;
import java.util.Locale;
public class Contador {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Informe um número: ");
		int parametroUm = scanner.nextInt();
		
		System.out.println("Informe outro número: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		
	}
	
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();	
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo número: " + i);
		}
	}
	
}
