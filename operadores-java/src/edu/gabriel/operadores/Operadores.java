
public class Operadores {

	public static void main(String[] args) {		
		
		int a = 1, b = 2;
		
		if (a == b) {
			System.out.println("verdadeiro");
		}else {
			System.out.println("falso");
		}
		
		String res = a < b ? "verdadeiro" : "falso";  // Entendendo operador ternário.
		
		System.out.println(res);
		
		String nomeUm = "Gabriel";
		String nomeDois = new String("Gabriel");
		
		System.out.println(nomeUm == nomeDois); // O resultado da "false" pois há dois objetos na variável "nomeDois", ou seja, dois obejtos na memória.
		   
		System.out.println(nomeUm.equals(nomeDois)); // Quando estamos falando de comparação de objetos ou textos, deve se usar o método equals, o mesmo compara o conteúdo dos objetos.
		
		
		/* 		 	
		 	Operadores Lógicos.
			&& - AND  = Só atenderá a condição caso ambas as sejam verdadeiras.
			|| - OR	= Atenderá a condição caso uma das duas condições sejam verdadeiras.
			
		*/
		
		// AND
		if(b > a && a == 1) {
			System.out.println("Condição AND é verdadeira.");
		}else {
			System.out.println("Condoção AND é falsa");
		}
		
		//OR
		if(a > b || b == 1) {
			System.out.println("Condição OR é verdadeira");
		}else {
			System.out.println("Condição OR é falsa");
		}
	}
	
}
