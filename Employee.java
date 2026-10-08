package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = (percentage / 100 + 1) * grossSalary;
	}
	
	public String toString() {
		return "Name = "
			+ name 
			+ ", Salario Bruto: "
			+ String.format("%.2f", grossSalary)
			+ ", Salario Liquido Após Impostos = "
			+ String.format("%.2f", netSalary());
	}
}
