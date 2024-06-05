package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado!");
			}
		} while (continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com o " + candidato + " na " + tentativasRealizadas + " tentativas.");
		} else {
			System.out.println("NÃO conseguimos entrar em contato com o " + candidato + ". Número máximo de tentativas: " + tentativasRealizadas);
		}
		
	}
	
	//Método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

	static void imprimirSelecionados() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

		System.out.println("Imprimindo lista de selecionados.");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}

	}

	static void selecaoCandidatos() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
				"Daniela", "Jorge" };

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.00;

		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out
					.println("O candidato " + candidato + ", solicitou este valor de salário: R$" + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			} else {
				System.out.println("O candidato " + candidato + " NÃO foi selecionado para a vaga.");
			}
			candidatosAtual++;
		}
	}

	private static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato.");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta.");
		} else {
			System.out.println("Agurdando o resultado dos demais candidatos.");
		}
	}

}
