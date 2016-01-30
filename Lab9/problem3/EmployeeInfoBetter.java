package problem3;

/*In the lecture demo lesson9.lecture.comparators2.EmployeeInfoBetter, we showed
how to use Comparator.comparing and Comparator.thenComparing to create better,
more readable, and more functional-style Comparators. In the demo code, however, there is
branching logic that could be replaced by a cleaner design:
public void sort(List<Employee> emps, final SortMethod method) {
if(method == SortMethod.BYNAME) {
Collections.sort(emps,
Comparator.comparing(byName)
.thenComparing(bySalary));
} else {
Collections.sort(emps,
Comparator.comparing(bySalary)
.thenComparing(byName));
}
}
Eliminate the branching logic by defining a HashMap, together with a Pair class, in a clever
way. Start with the EmployeeInfoBetter and Employee classes from
lesson9.lecture.comparators2, and then modify EmployeeInfo in a clever way that
eliminates branching logic.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class Pair<L,R> {
    private L l;
    private R r;
    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }
    public L getL(){ return l; }
    public R getR(){ return r; }
    public void setL(L l){ this.l = l; }
    public void setR(R r){ this.r = r; }
}

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> e.getSalary();

	public void sort(List<Employee> emps, final SortMethod method) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, Comparator.comparing(byName).thenComparing(bySalary));
		} else {
			Collections.sort(emps, Comparator.comparing(bySalary).thenComparing(byName));
		}
	}



	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));


		EmployeeInfoBetter ei = new EmployeeInfoBetter();

		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println(emps);


		//same instance
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		//System.out.println(emps);
	}
}
