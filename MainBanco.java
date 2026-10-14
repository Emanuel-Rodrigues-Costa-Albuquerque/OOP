package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class MainBanco {
	public static void main(String[] args) {
		char opt;
		String usuarioConta = null;
		double deposito = 0;
		double saque = 0; 
		int numeroConta = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account holder: ");
		usuarioConta = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		opt = sc.next().toUpperCase().charAt(0);
		System.out.println();
		
		Banco banco = new Banco();
		
		if(opt == 'Y') {
			System.out.println("Enter inital deposit value: ");
			deposito = sc.nextDouble();
			numeroConta = (int) (Math.random() * 10000);
			banco = new Banco(numeroConta, usuarioConta, deposito);
		}
		if(opt == 'N') {
			numeroConta = (int) (Math.random() * 10000);
			banco = new Banco(numeroConta, usuarioConta);
		}

		
		System.out.println("Account Data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f", banco.getNumeroConta(), banco.getNome(), banco.getSaldo());
		
		System.out.println();
		
		System.out.print("Enter a Deposit Value: ");
		deposito = sc.nextDouble();
		banco.deposito(deposito);
		
		System.out.println();
		
		System.out.println("Updated Account Data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f", banco.getNumeroConta(), banco.getNome(), banco.getSaldo());
		
		System.out.println();
		
		System.out.print("Enter a Withdraw Value: ");
		saque = sc.nextDouble();
		banco.saque(saque);
		
		System.out.println();
		
		System.out.println("Updated Account Data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f", banco.getNumeroConta(), banco.getNome(), banco.getSaldo());
		
		sc.close();
	}

}
 