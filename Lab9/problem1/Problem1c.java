package problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*You have a Stream of Integers called myIntStream and you need to output both the
maximum and minimum values. Write compact code that efficiently accomplishes this.
list.stream().max(Integer::compare).get();
list.stream().min(Integer::compare).get();*/

public class Problem1c {
	public static void main(String...strings){

		List<Integer> list = Arrays.asList(3,5,2,7,1,9);
		Stream<Integer> integerStream1 =list.stream();

		System.out.println("Maximum value: " +integerStream1.max(Integer::compare).get());


		Stream<Integer> integerStream2 =list.stream();
		System.out.println("Minimum value: " + integerStream2.min(Integer::compare).get());
	}

}
