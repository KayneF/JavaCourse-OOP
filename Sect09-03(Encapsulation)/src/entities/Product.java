// ================== Encapsulamento ==================== \\
/**
 * O encapsulamento, garante que, os atributos das Classes ou
 * Objetos não sejam acessados indevidamente, e para isso, 
 * são criados dentro dos Objetos, métodos de acesso chamados
 * de "Getters" e "Setters", e são através deles que os atributos
 * poderão ser acessados ou alterados.
 * 
 * Métodos de acesso devem ser cirados conforme a necessidade
 * do programa, e não necessariamente, deverá ou não sempre existir
 * métodos pré definidos de acesso para cada atributo.
 */

package entities;

public class Product {

	private String name;
	private double price;
	private int units;
	
	public Product() {}

	public Product(String name, double price, int units) {
		this.name = name;
		this.price = price;
		this.units = units;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	// Setter
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
	
	/**
	 * Note que, no caso do atributo de unidades "units", não criamos um 
	 * método Setter. Aqui, a alteração direta pode gerar um possível 
	 * problema, onde o número de unidades pode ser comprometida. Assim 
	 * sendo, criamos dois métodos de acesso, onde cada um deles irá 
	 * apenas adicionar, ou remover unidades conforme a necessidade, ao 
	 * invés de simplesmente usar um método que iria alterar o valor das 
	 * unidades diretamente como um todo.
	 */
	
	public void addUnits(int addedUnits) {
		this.units += addedUnits;
	}
	public void removeUnits(int removedUnits) {
		this.units -= removedUnits;
	}

	public String toString() {
		return "\nProduct name: " + this.name
				+ "\nAvailable units: " + this.units
				+ "\nPrice per unit: $" + String.format("%.2f", this.price)
				+ "\nTotal price in stock: $" + String.format("%.2f", this.price * this.units);
	}
}
