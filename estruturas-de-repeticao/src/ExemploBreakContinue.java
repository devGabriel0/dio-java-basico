
public class ExemploBreakContinue {

	public static void main(String[] args) {

		// For contendo "continue" faz com que o looping CONTINUE o looping mesmo atendendo a excessão solicitada.
		for(int i = 0; i <= 10; i++) {
			if(i == 3) {
				System.out.println("Achou");
				continue;
			}
			System.out.println(i);
		}
		
		
		// For contendo "break" faz com que o looping se ENCERRE quando ele achar a excessão solicitada.
		for(int i = 0; i <= 10; i++) {
			if(i == 3) {
				break;
			}
			
			System.out.println(i);
		}
		
	}
	
}
