// ************** Sobrecarga (Overload) ************** \\
/**
 * Em Java, podemos criar multiplos métodos com o mesmo nome,
 * com isso, os métodos são sobrescritos e utilizados conforme
 * a necessidade do programa.
 */

package entities;

public class Product {

	private String name;
	private double price;
	private int units;
	
	// Construtor vazio
	public Product() {}

	// Construtor original com todos os parâmetros dos atributos
	public Product(String name, double price, int units) {
		super();
		this.name = name;
		this.price = price;
		this.units = units;
	}
	
	// Construtor parcial
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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
