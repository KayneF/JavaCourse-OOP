package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		byte n = scan.nextByte(); 
		for (byte i=1; i<=n; i++) {
			System.out.printf("%nShape #%d data: %n", i);
			System.out.print("Rectangle or Circle (R/C)? ");
			scan.nextLine();
			char shape = scan.nextLine().toUpperCase().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.nextLine().toUpperCase());
			if (shape == 'R') {
				System.out.print("Width: ");
				double width = scan.nextFloat();
				System.out.print("Height: ");
				double height = scan.nextFloat();
				list.add(new Rectangle(color, width, height));
			} else if (shape == 'C') {
				System.out.print("Radius: ");
				double radius = scan.nextFloat();
				list.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println("\nSHAPE AREAS: ");
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		scan.close();
	}
}
