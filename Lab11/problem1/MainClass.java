package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * problem 1 a
		 */

		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		// List<Number> num = ints; //Compliation error - non covariant
		// num.add(3.24);

		/*
		 * problem 1 b
		 */

		List<Integer> ints1 = new ArrayList<>();
		ints1.add(1);
		ints1.add(2);
		List<? extends Number> num1 = ints1;
		//num1.add(3.03); // boolean add(E e); which does not allow to add its
		// With the extends wildcard, values can be gotten but not inserted

		List<Number> nums = new ArrayList<Number>();
		List<Integer> ints2 = Arrays.asList(1, 2);
		List<Double> doubles = Arrays.asList(2.78, 3.14);
		nums.addAll(ints2);
		nums.addAll(doubles);
		System.out.println(nums);

	}

}
