package stream;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class StreamBuilder implements Stream.Builder<String> {

	List<String> list = new ArrayList<String>();

	@Override
	public void accept(String t) {
		list.add(t);
	}

	@Override
	public Stream<String> build() {
		return list.stream();
	}

}

public class MainClass {

	public static void main(String[] args) {

		// Example 1
		Stream.of("A", "B", "C", "D").forEach(System.out::println);

		// Example 2
		Stream.of("This is an example of Stream".split(" ")).forEach(System.out::println);

		// Example 3
		List<String> list = Arrays.asList("A", "B", "C", "D");
		list.stream().forEach(System.out::println);

		// Example using stream builder interface
		// ---------------------------------------
		StreamBuilder streambuilder = new StreamBuilder();
		streambuilder.accept("Achyut");
		streambuilder.accept("Amit");
		streambuilder.accept("Siken");
		streambuilder.accept("Sagar");
		streambuilder.accept("Tabze");

		streambuilder.build().forEach(System.out::println);

		// Example builder static method
		Stream.Builder<String> streambld = Stream.builder();
		streambld.accept("Achyut");
		streambld.accept("Amit");
		streambld.accept("Siken");
		streambld.accept("Sagar");
		streambld.accept("Tabze");

		streambld.build().forEach(System.out::println);

		// Example generating infinite streams

		Stream.generate(new Random()::nextLong).limit(5).forEach(System.out::println);

		// Example iterator
		Stream.iterate(BigInteger.ONE, x -> x.add(BigInteger.ONE)).limit(26).forEach(System.out::println);

		// Example Empty stream
		Stream.empty();

		// Employee list
		List<Employee> listEmp = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

//		set salary using stream
		Stream<Employee> streamListEmp = listEmp.stream();
		streamListEmp.forEach(x->x.setSalary(2222222));
//		checking again
//		streamListEmp.forEach(System.out::println); //Expected error : IllegalStateException
//

//		FlatMapping example
		List<Integer> salary = listEmp.stream().map(x->x.getSalary()).collect(Collectors.toList());

		List<List<Integer>> listsalary = salary.stream().limit(3)
				.map(x->Arrays.asList(x*5,x,x*3))
				.collect(Collectors.toList());

		listsalary.forEach(System.out::print);
		System.out.println();

		List<Integer> flatlistsalary = salary.stream().limit(3)
				.flatMap(x->Arrays.asList(x*5,x,x*3).stream())
				.collect(Collectors.toList());

		flatlistsalary.forEach(System.out::print);

		listEmp.stream().filter(x->x.getFirstName().contains("T")).collect(Collectors.toList());




	}

}
