package problem3.A;

public class Circle {
	private double radius=1.0;
	private String color="red";
	
	public Circle(){
		
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}

	public double getArea(){
		return Math.PI*radius*radius;
	}

	public String toString(){
		return "Circle has " + radius + " and Area " + getArea();
	}
	
}
