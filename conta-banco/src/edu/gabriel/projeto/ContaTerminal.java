package edu.gabriel.projeto;

import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Bem-vindo ao banco!");
		
		System.out.println("Inicialmente, informe seu nome: ");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite a agencia da conta: ");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o número da sua conta: ");
		int numero = scanner.nextInt();
		
		System.out.println("Informe o valor que gostaria de adicionar a sua conta: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
	}
	
}
