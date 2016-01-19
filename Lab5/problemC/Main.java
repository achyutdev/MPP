package lab.problemC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String... strings) {
		List<ShapeInterface> shapes = new ArrayList<>();
		ShapeInterface shapeArray[] = { new Circle(11), new Triangle(4, 9), new Rectangle(6, 8),
				new Triangle(3.4, 4.99) };
		shapes.addAll(Arrays.asList(shapeArray));

		for (ShapeInterface shape : shapes) {
			System.out.println("Area of " + shape.getClass().getSimpleName() + " is :" + shape.computeArea());
		}
	}

}
