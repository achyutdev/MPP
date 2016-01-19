package lab.problemC;

public class Triangle implements ShapeInterface {
	private double base;
	private double hight;

	public Triangle(double base, double hight) {
		super();
		this.base = base;
		this.hight = hight;
	}

	public double getBase() {
		return base;
	}

	public double getHight() {
		return hight;
	}

	@Override
	public double computeArea() {
		return 0.5 * base * hight;
	}


}
