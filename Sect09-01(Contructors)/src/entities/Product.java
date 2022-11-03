// ================== Construtores ==================== \\
/**
 * Métodos construtores tem o propósito de manter um padrão,
 * para que, quando um objeto for criado, seja garantido que
 * ele não tenha certos atributos vazios. Por exemplo, ao 
 * criar uma conta bancária para um usuário, não faz sentido 
 * essa conta não ter o nome ou número da conta do cliente, 
 * portanto, o método construtor garante que esses valores 
 * sempre serão atribuidos em sua criação.
 */

package entities;

public class Product {

	private String name;
	private double price;
	private int units;

	public Product(String name, double price, int units) {
		super();
		this.name = name;
		this.price = price;
		this.units = units;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}

	public String toString() {
		return "\nProduct name: " + this.name
				+ "\nAvailable units: " + this.units
				+ "\nPrice per unit: $" + String.format("%.2f", this.price)
				+ "\nTotal price in stock: $" + String.format("%.2f", this.price * this.units);
	}
}
