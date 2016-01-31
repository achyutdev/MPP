/**
 *
 */
package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import predicator.Employee;

/**
 * @author Achyut Dev
 *
 */
public class MainClass {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("Ram", 20000, 22), new Employee("Hari", 20000, 20),
				new Employee("Shayma", 22000, 32), new Employee("Shekhar", 30000, 12),
				new Employee("Asley", 250000, 42), new Employee("Goxta", 2230, 29));

		// Example 1
		Function<Integer, Double> intToDob = x -> x * 2.0;
		System.out.println(intToDob.apply(32));

		System.out.println("-----------------\n");

		// Example 2
		List<Integer> ageList = getAgeList(list);
		ageList.forEach(System.out::println);

		System.out.println("-----------------\n");

		// Example 3
		System.out.println("sum of age :"+ getSum(list, Employee::getAge));

	}

	private static List<Integer> getAgeList(List<Employee> list) {
		List<Integer> ageList = new ArrayList<Integer>();
		list.forEach(e -> ageList.add(e.getAge()));
		return ageList;
	}

	public static <T> int getSum(List<T> list, Function<T, Integer> function){
		int sum =0;
		for (T t : list) {
			sum+=function.apply(t);
		}
		return sum;
	}

}
