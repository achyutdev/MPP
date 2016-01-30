/**
 *
 */
package problem8;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary{
	final static TriFunction<List<Employee>, Integer, Character, Long> COUNT_EMPLOYEE =
			(x,y,z)->x.stream()
			.filter(employee->employee.getSalary()>y)
			.filter(employee -> employee.lastName.substring(0, 1).compareTo(y+"")>0)
			.count();


	final static TriFunction<List<Employee>, Integer, Character, List<String>> SORTED_UPPERCASE_EMPLOYEE =
			(x,y,z)->x.stream()
			.filter(employee->employee.getSalary()>y)
			.filter(employee -> employee.firstName.substring(0, 1).compareTo(z+"")<0)
			.map(employee->employee.firstName+" "+employee.lastName)
			.sorted()
			.map(name->name.toUpperCase())
			.collect(Collectors.toList());


}