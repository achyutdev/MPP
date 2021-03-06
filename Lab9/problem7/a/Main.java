package problem7.a;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));


		Predicate<Employee> pre = x -> x.lastName.substring(0, 1).compareTo("M")>0;


		String stringEmployee = list.stream()
		.filter(x->x.getSalary()>100000)
		.filter(pre)
		.map(x->x.firstName+" "+x.lastName)
		.collect(Collectors.joining(", "));

		System.out.println(stringEmployee);
	}

}
