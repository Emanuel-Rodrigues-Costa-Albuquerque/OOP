package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Programa {
	public static void main(String []args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rmv, add = 0;
		
		
		Products product = new Products();
		
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.print(product);
		
		System.out.println("Write something to remove from stock: ");
		rmv = sc.nextInt();
		product.removeProduct(rmv);
		
		System.out.print(product);
		
		System.out.println("Write Something to Add in Stock: ");
		add = sc.nextInt();
		
		product.addProduct(add);
		
		System.out.print(product);
		

		sc.close();
	}

}
