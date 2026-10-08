package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.println();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println();
		System.out.print("TAX: ");
		employee.tax = sc.nextDouble();
		
		System.out.print(employee);
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.printf("Updated DATA: %s, $ %.2f", employee.name, employee.netSalary());
		
		sc.close();
	}
}
