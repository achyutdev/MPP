package lab.problemC;

public class Circle implements ShapeInterface{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI*radius*radius;
	}
	
	

}
