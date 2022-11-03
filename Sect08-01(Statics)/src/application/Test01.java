package application;

import java.util.Scanner;

public class Test01 {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = scanner.nextDouble();
		
		double circ = circunference(radius);
		double vol = volume(radius);
		
		System.out.printf("Circunference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", PI);
		
		scanner.close();
	}
	
	// Métodos na classe principal devem ser estáticos
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
	
}
