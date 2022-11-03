
// === Métodos estáticos (Static) === \\
/**
  * Com o comando "static", podemos chamar métodos e variáveis 
  * criadas, sem a necessidade de criar uma instancia do objeto 
  * ou classe. Tudo que precisamos fazer, é chama-lo normalmente 
  * como uma classe "utilitária" do próprio Java, chamando pelo 
  * nome da classe, assim como "Math.random()" por exemplo.
  */

package application;

import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Instância não necessária 
//		Calculator calc = new Calculator();		
		
		System.out.println("Enter radius: ");
		double radius = scanner.nextDouble();
		
		// Métodos são chamados pelo nome da classe
		double circ = Calculator.circunference(radius);		
		double vol = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", vol);
		// Valores constantes também são chamados pelo nome da classe
		System.out.printf("PI value: %.2f%n", Calculator.PI);	
		
		scanner.close();
		
	}
	
}
