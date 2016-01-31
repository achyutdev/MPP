/**
 *
 */
package predicator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Achyut Dev
 *
 */
public class MainClass {

	public static void main(String... strings) {
		Predicate<Integer> agefactor = (age) -> age > 21;

		 System.out.println(agefactor.test(33));

		 System.out.println("------------------------------\n");

		List<Employee> list = Arrays.asList(new Employee("Ram", 20000, 22), new Employee("Hari", 20000, 20),
				new Employee("Shayma", 22000, 32), new Employee("Shekhar", 30000, 12),
				new Employee("Asley", 250000, 42), new Employee("Goxta", 2230, 29));


		Predicate<Integer> pre = (x -> x > 30);

		list.forEach((x) -> {
			if (pre.test(x.getAge()))
				System.out.println(x);
		});

		System.out.println("------------------------------\n");

		Predicate<Employee> preEm = (x) -> x.getAge()>30;
		display(list,preEm);

	}

	public static void display(List<Employee> list, Predicate<Employee> tester) {
		list.forEach((x) -> {
			if (tester.test(x))
				System.out.println(x);
		});
	}
}
