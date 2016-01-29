package problem5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
				"Away", "On Vacation", "Everywhere you want to be");

		//implement a Consumer
//		problem 5 a
		Consumer<String> consumer1 = t ->System.out.println(t);

		Consumer<String> consumer2 = System.out::println;


		//print each element of the list in upper case format
		list.forEach(consumer1);

		System.out.println("----------------------------");

		list.forEach(consumer2);



	}



}