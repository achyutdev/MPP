package problem.C;

public abstract class Employee {
	private int empid;
	
	
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	
	public int getEmpid() {
		return empid;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", calcGrossPay()=" + calcGrossPay() + "]";
	}

	public abstract Paycheck calcCompensation(int month);
	
	public abstract double calcGrossPay();
}
