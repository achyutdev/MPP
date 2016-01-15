package problem.C;

public class Hourly extends Employee{
	
	private double hourlyWage;
	private double hoursPerWeek;
	
	
	public Hourly(int id,double hourlyWage, double hoursPerWeek) {
		super(id);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public double calcGrossPay() {
		return 4*hoursPerWeek*hourlyWage;
	}
	
	@Override
	public Paycheck calcCompensation(int month){
		return new Paycheck(calcGrossPay()*month);
		
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}
	

}
