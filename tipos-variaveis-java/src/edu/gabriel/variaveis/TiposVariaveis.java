
public class TiposVariaveis {

	public static void main(String[] args) {
		
		byte idade = 123;
		
		short ano = 2024;
		
		int cep = 21905833; // Se começar com zero, talvez tenha que usar outro tipo de dado (Pode usar String).
		
		long cpf = 98765432196L; // Se começar com zero, talvez tenha que usar outro tipo de dado. (Pode usar String).
								 // Variável do tipo Long tem que conter uma letra "L" no final do valor, se não da erro e vai entender como se fosse uma variavél Int	
		
		float pi = 3.14f; // Variável do tipo Float, tem que conter uma letra "F" no final do valor, se não da erro e vai entender como se fosse uma variável do tipo Double.
		
		double salario = 2100.44;
		
		
		// Entendendo cast na prática
		// Cast = atribui um valor de um tipo de dado especifico em outro tipo de dado.
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		// Variavel constante = valor que não pode ser alterado futuramente.
		
		final String EXEMPLO = "Não pode ser alterado";
		
		System.out.println(EXEMPLO);
		
//		EXEMPLO = "mudou"; // Apresenta erro, pois anteriormente a variável "EXEMPLO" foi definida como uma variável constante, utilizando a palavra reservada "final" no início da declaração e como todas as letrar maiúsculas.

	}

}
