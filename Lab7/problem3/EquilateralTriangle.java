package problem3;

public class EquilateralTriangle implements Polygon {

	private double side;

	public EquilateralTriangle(double side) {
		this.side=side;
	}

	public void setSide(double side){
		this.side=side;
	}

	public double getSide(){
		return this.side;
	}

}
