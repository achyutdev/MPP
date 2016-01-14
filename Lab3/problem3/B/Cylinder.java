package problem3.B;

import problem3.A.Circle;

public class Cylinder{
	private double height = 1.0;
	private Circle circle;
	
	public Cylinder() {
		this.circle = new Circle();
	}

	public Cylinder(double height) {
		this.circle = new Circle();
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		this.circle = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume(){
		return circle.getArea()*height;
	}
	
	@Override
	public String toString(){
		return "Cylinder has " + height + " and Volume " + getVolume();
	}
}
