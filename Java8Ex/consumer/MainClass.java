/**
 *
 */
package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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
		list.forEach(e->System.out.println(e.getName()));


		System.out.println("-----------------\n");

//		Example 2
		Consumer<Employee> getUpperName = e ->e.setName( e.getName().toUpperCase());
		Consumer<Employee> combine =getUpperName.andThen(System.out::println);

		list.forEach(combine);

//		Example3




	}

}
