
public class SwitchCase {

	public static void main(String[] args) {
		
		String letra = "g".toUpperCase();
		
		switch (letra) {
		case "P":
			System.out.println("Pequeno");
			break;
			
		case "M":
			System.out.println("Médio.");
			break;
		
		case "G":
			System.out.println("Grande.");
			break;
		default:
			System.out.println("Valor não encontrado.");
			break;
		}
		
	}
	
}
