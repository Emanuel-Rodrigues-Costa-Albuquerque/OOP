package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class MainRectangle {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle Width and Height: ");
		System.out.print("Enter Width: ");
		rectangle.width = sc.nextDouble();
		System.out.println();
		System.out.print("Enter Height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.print(rectangle);
		
		
		sc.close();
	}
}
