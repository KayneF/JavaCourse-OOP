package entities;

import entities.enums.Color;

public final class Circle extends Shape {

	private Double radius;

	public Circle() {}
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
}
