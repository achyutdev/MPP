package problem8;

/*In the package lesson9.labs.prob8, a Main class is provided that is essentially the same as the
one used in Problem 7. Comments appear in the main method that indicate two queries that
need to be executed. As in Problem 7, create a class LambdaLibrary that will store
implementations of these queries as lambda pipeline expressions. Then call these expressions in
the main method to verify they produce the expected results.
*/
import java.util.Arrays;
import java.util.List;


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

		//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'


		System.out.println("Number of Employee :" + LambdaLibrary.COUNT_EMPLOYEE.apply(list, 100000, 'E'));



		System.out.println("----------------------------------------\n");
		//print a list of sorted full names - all upper case -- of Employees with
		//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'


		LambdaLibrary.SORTED_UPPERCASE_EMPLOYEE.apply(list, 85000, 'R').forEach(System.out::println);

	}

}
