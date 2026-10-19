package principal;

import java.util.Scanner;
import java.util.Locale;

import entities.Veiculo;

public class MainVeiculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char opt;
		String placa;
		String modelo;
		double consumo;
		double litros;
		double precolitro;
		
		System.out.print("Placa: ");
		placa = sc.nextLine();
		System.out.println();
		System.out.print("Modelo: ");
		modelo = sc.nextLine();
		System.out.println();
		System.out.print("Consumo (km/L): ");
		consumo = sc.nextDouble();
		System.out.println();
		
		Veiculo veiculo = new Veiculo();
		
		System.out.print("Já possui combustivel? (y/n)? ");
		opt = sc.next().toUpperCase().charAt(0);
		System.out.println();
		if(opt == 'Y') {
			System.out.print("Litros no tanque: ");
			litros = sc.nextDouble();
			veiculo = new Veiculo(placa, modelo, consumo, litros);
		}
		else if(opt == 'N') {
			veiculo = new Veiculo(placa, modelo, consumo);
		}
		else {
			System.out.println("OPÇÃO INVALIDA!!");
		}
		
		System.out.println(veiculo);
		
		int opc;
		
		do {
			System.out.println("Calculo de Viajem: ");
			System.out.print("Litros a Abastecer: ");
			litros = sc.nextDouble();
			veiculo.abastecer(litros);
			System.out.println();
			
			System.out.print("Distancia a Percorrer (km): ");
			double distancia = sc.nextDouble();
			String resultado = (distancia <= 0 ) ? "O valor inserido é invalido" : " O valor é Valido ";
			if(resultado.equals("O valor inserido é invalido")) {
				System.out.println("O valor inserido é " + resultado);
				break;
			}
			veiculo.percorrer(distancia);
			
			
			System.out.print("Preço do Litro: ");
			precolitro = sc.nextDouble();
			resultado = (precolitro <= 0) ? "O valor inserido é invalido" : " O valor é Valido ";
			if(resultado.equals("O valor inserido é invalido")) {
				System.out.println("O valor inserido é " + resultado);
				break;
			}
			System.out.printf("O Custo estimado da Viajem foi %.2f\n", Veiculo.custoViagem(distancia, consumo, precolitro));
			System.out.print("Digite 1 para continuar ou 0 para Sair...");
			opc = sc.nextInt();
		} while ( opc != 0 );
		
		sc.close();
	}
}