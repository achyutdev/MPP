package function;

public class Employee {
	private String name;
	private int salary;
	private int age;


	public Employee(String n, int s, int age) {
		this.name = n;
		this.salary = s;
		this.age=age;
	}



	public String getName() {
		return name;
	}



	public int getSalary() {
		return salary;
	}



	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
