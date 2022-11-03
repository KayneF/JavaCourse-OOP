package application;

import java.util.Scanner;

import controller.ProductController;
import entities.Product;		

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("******** Creating new product ******** ");
		System.out.println("Enter product data: ");
		System.out.println("Product name: ");
		String name = scanner.nextLine();
		System.out.println("Product price: ");
		double price = scanner.nextDouble();
//		System.out.println("Units available: ");
//		int units = scanner.nextInt();
		
		// Instância criada com apenas 2 parâmetros
		Product p1 = new Product(name, price);	
		
		// Instância criada com parâmetros vazios
		@SuppressWarnings("unused")
		Product p2 = new Product();

		ProductController pc = new ProductController();
		
		System.out.println(p1);
		
		System.out.println("\nDo you like to add more units? (type a value):");
		pc.addUnits(p1, scanner.nextInt());
		
		System.out.println(p1);
		
		System.out.println("\nDo you like to remove units? (type a value):");
		pc.removeUnits(p1, scanner.nextInt());
		
		System.out.println(p1);
		
		scanner.close();
	}
}
