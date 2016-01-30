package problem1;

import java.util.stream.IntStream;

public class Problem1a {

	public static void main(String...strings){
		IntStream ones = IntStream.generate(() -> 1);
		ones.forEach(System.out::println);
	}

}
