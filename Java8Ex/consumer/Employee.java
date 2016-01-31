package consumer;

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



	public void setName(String name) {
		this.name = name;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
