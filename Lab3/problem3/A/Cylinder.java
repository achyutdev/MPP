package problem3.A;

public class Cylinder extends Circle{
	private double height = 1.0;

	
	public Cylinder() {
		super();
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume(){
		return getArea()*height;
	}
	
	@Override
	public String toString(){
		return "Cylinder has " + height + " and Volume " + getVolume();
	}
}
