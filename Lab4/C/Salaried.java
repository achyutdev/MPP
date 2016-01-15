package problem.C;

public class Salaried extends Employee{
	
	private double salary;
	
	
	public Salaried(int id, double salary) {
		super(id);
		this.salary = salary;
	}
	
	
	public double getSalary() {
		return salary;
	}


	@Override
	public double calcGrossPay() {
		return salary;
	}


	@Override
	public Paycheck calcCompensation(int month) {
		return new Paycheck(calcGrossPay()*month);
	}
	
}
