package problem4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {

	public static void main(String[] args) {


//		problem 4 a
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);

		List<? extends Number> nums = ints;
		double dlb = sum(nums);

		//nums.add(3.24);// which does not allow to add its
		// With the extends wildcard, values can be gotten but not inserted


//		problem 4 b

		List<Object> objs = new ArrayList<Object>();
		objs.add(1);
		objs.add("Two");

		List<? super Integer> ints1=objs;

		ints1.add(3);
//		double dlb1 = sum(ints1);

//		System.out.println(dlb1);
//		no compliler error : List<? super Integer> can take its all super class and object is also super class of Integer




	}

	public static <T extends Comparable<?super T>> T second(List<T> list){
		return list.stream().sorted((x,y)->x.compareTo(y)).collect(Collectors.toList()).get(1);
	}

	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums)
			s += num.doubleValue();
		return s;
	}
}
