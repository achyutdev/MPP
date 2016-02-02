package problem5.soln1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AsStringTest {


	@Test
	public void test() {
		List<Employee> emps = Arrays.asList(
				new Employee("Joe", "Davis", 120000),
				new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000));


		assertEquals("Alice Richards, Steven Walters", Main.asString(emps));
	}

}
