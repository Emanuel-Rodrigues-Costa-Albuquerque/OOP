package entities;

public class Alunos {
	public String nomeAluno;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3; 
	
	public void verifNota() {
		double total = this.trimestre1 + this.trimestre2 + this.trimestre3;
		
		if(total >= 60) {
			System.out.printf("FINAL GRADE = %.2f\n", total);
			System.out.println("PASS");	
		} else {
			System.out.printf("FINAL GRADE = %.2f\n", total);
			System.out.println("FALIED");
			System.out.printf("Missing = %.2f points \n", (60 - total));
		}
	
	}
	
	
}
