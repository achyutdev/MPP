package problem2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
			int result = e1.name.compareTo(e2.name);
			if(result ==0){
				 EmployeeSalaryComparator comp = new EmployeeSalaryComparator();
				 return comp.compare(e1, e2);
			}else
				return result;
	}
}
