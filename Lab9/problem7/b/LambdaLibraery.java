/**
 *
 */
package problem7.b;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Achyut Dev
 *
 */
public class LambdaLibraery {

		public static final TriFunction<List<Employee>, String,Integer,	String> EMPLOYEE_NAMES =
				(x,y,z)->x.stream()
				.filter(employee->employee.getSalary()>z)
				.filter(employee -> employee.lastName.substring(0, 1).compareTo(y)>0)
				.map(employee->employee.firstName+" "+employee.lastName)
				.collect(Collectors.joining(", "));


}
