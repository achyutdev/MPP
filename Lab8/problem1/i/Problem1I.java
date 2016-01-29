package problem1.i;

import java.util.function.Supplier;

class SupplierImplements {
	public static double getRandom(){
		Supplier<Double> randn = new Supplier<Double>() {

			@Override
			public Double get() {
				return Math.random();
			}
		};
		return randn.get();
	}
}

public class Problem1I {
	public static void main(String...strings){
		Supplier<Double> su = Math::random;

//		Lambda expression
		Supplier<Double> su1 = ()->Math.random();

		System.out.println(su.get());
		System.out.println(su1.get());

		System.out.println(SupplierImplements.getRandom());



	}
}
