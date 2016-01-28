package problem3;

public interface Polygon extends ClosedCurve{

	default double computePerimeter(double[] a){
		double perimeter =0;
		for (double d : a) {
			perimeter+=d;
		}
		return perimeter;
	}

}
