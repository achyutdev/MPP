package lab.problemC;

public class Rectangle implements ShapeInterface {
	private double widht;
	private double length;

	public Rectangle(double width, double length) {
		this.length = length;
		this.widht = width;
	}

	public double getWidht() {
		return widht;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea() {
		return widht * length;
	}

}
