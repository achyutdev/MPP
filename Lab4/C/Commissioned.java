package problem.C;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{

	private double commission;
	private double baseSalary;
	private List<Order> orders = new ArrayList<>();
	
	
	
	public Commissioned(int empid, double commission, double baseSalary, List<Order> orders) {
		super(empid);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	@Override
	public double calcGrossPay() {
		double totalCommission = 0;
		for (Order order : orders) {
			totalCommission+=order.getOrderAmount()*(commission/100);
		}
		return baseSalary+totalCommission;
	}
	

	@Override
	public Paycheck calcCompensation(int month) {
		return new Paycheck(calcGrossPay()*month);
	}
	

}
