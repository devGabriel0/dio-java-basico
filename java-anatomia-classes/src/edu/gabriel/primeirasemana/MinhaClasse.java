import java.time.Year;
public class MinhaClasse {

	public static void main(String[] args) {
		// final String BR = "Brasil"; ------- Variável com "final" no inicial e contem letras maiúsculas são variáveis constantes, ou seja, não podem ser alteradas posteriormente. 

		String priNome = "Gabriel";
		String segNome = "Carneiro";
		
		int anoNascimento = 2002;
		Year anoAtual = Year.now(); // Importando a classe Year para saber o ano atual que posteriormente será subtraido pelo ano de nascimento para assim saber quantos anos tem o usuário.
		int idadeFinal = anoAtual.getValue();
		
		String nomeCompleto = nomeCompleto(priNome, segNome);

		int idade = idade(anoNascimento, idadeFinal);

		System.out.println("Seu nome é: " + nomeCompleto + "\n" + "Sua idade é: " + idade + " anos");
	}

	public static String nomeCompleto(String priNome, String segNome) {
		return priNome.concat(" ").concat(segNome);
	}

	public static int idade(int anoNascimento, int idadeFinal) {
		return idadeFinal - anoNascimento;
	}
// Utilizando métodos e classes para exibir o resultado no console.
}
