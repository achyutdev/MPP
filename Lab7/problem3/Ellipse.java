package problem3;

public class Ellipse implements ClosedCurve{
	private double eccentricity;
	private double majorAxis;

	public Ellipse(double eccentricity, double majorAxis) {
		super();
		this.eccentricity = eccentricity;
		this.majorAxis = majorAxis;
	}

	public double getEccentricity() {
		return eccentricity;
	}

	public double getMajorAxis() {
		return majorAxis;
	}

	@Override
	public double computePerimeter() {
		return 4 * majorAxis*eccentricity;
	}


}
