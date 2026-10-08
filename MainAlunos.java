package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class MainAlunos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos alunos = new Alunos();
		
		System.out.println("Digite o nome do aluno a ser Avaliado: ");
		alunos.nomeAluno = sc.nextLine();
		
		System.out.println("Digite as notas do " + alunos.nomeAluno + " dos Três trimestres: ");
		alunos.trimestre1 = sc.nextDouble();
		alunos.trimestre2 = sc.nextDouble();
		alunos.trimestre3 = sc.nextDouble();
		if(alunos.trimestre1 <= 30 && alunos.trimestre2 <=35 && alunos.trimestre3 <=35 ) {
			alunos.verifNota();
		}
		else {
			System.out.print("VALORES INCORRETOS INSERIDOS TENTE NOVAMENTE: ");
			
		}
		sc.close();
}
}