package problem6;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Math;
import java.lang.Override;
import java.lang.String;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

class Apple{
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
			return e1.name.compareTo(e2.name);
	}
}


class Employee {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}


public class LamdaExpression {
	public static void main(String...strings){
		Function<Employee,String> fun = (Employee e) -> e.getName();
		Function<Employee,String> fun1 = Employee::getName;


		BiConsumer<Employee,String> fu3= (Employee e,String s) -> e.setName(s);
		BiConsumer<Employee,String> fu4= Employee::setName;



		BiFunction<String,String,Integer> fun4= (String s1,String s2) -> s1.compareTo(s2);
		BiFunction<String,String,Integer> fun5= String::compareTo;

		Comparator<String> fun6= (String s1,String s2) -> s1.compareTo(s2);
		Comparator<String> fun7= String::compareTo;

		BiFunction<Integer,Integer,Double> fun8= (Integer x,Integer y) -> Math.pow(x,y);
		BiFunction<Integer,Integer,Double> fun9= Math::pow;


		Function<Apple,Double> f= (Apple a) -> a.getWeight();
		Function<Apple,Double> f2= Apple::getWeight;

		Function<String,Integer> f3= (String x) -> Integer.parseInt(x);
		Function<String,Integer> f4= Integer::parseInt;

		EmployeeNameComparator comp = new EmployeeNameComparator();
		Comparator<Employee> com =(Employee e1, Employee e2) -> comp.compare(e1,e2);
		Comparator<Employee> com1 =comp::compare;


	}

}
