package problem3.B;

import problem3.A.Circle;
import problem3.A.Cylinder;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Circle without providing Radius");
		Circle circle1 = new Circle();
		System.out.println(circle1);
		System.out.println("Circle with radius");
		Circle circle2 = new Circle(20.23);
		System.out.println(circle2);
		
		System.out.println("Cylinder without any argument");
		Cylinder cylinder1 = new Cylinder();
		System.out.println(cylinder1);
		
		System.out.println("Cylinder with height");
		Cylinder cylinder2 = new Cylinder(20);
		System.out.println(cylinder2);
		
		System.out.println("Cylinder with height and radius");
		Cylinder cylinder3 = new Cylinder(10, 29.65);
		System.out.println(cylinder3);
		
		
	}

}
