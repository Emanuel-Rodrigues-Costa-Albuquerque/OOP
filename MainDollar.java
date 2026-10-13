package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Dollar;

public class MainDollar {
	public static void main(String[] args) {
		double dollar , qtd;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		dollar = sc.nextDouble();
		System.out.println();
		System.out.print("How many dollars will be bought? ");
		qtd = sc.nextDouble();
		System.out.println();
		double valorbruto = Dollar.converter(qtd, dollar);
		double valorliquido = Dollar.iof(valorbruto);
		System.out.printf("Amout to be paid in reais: %.2f ", valorliquido);
		
		
		sc.close();
	}
}
