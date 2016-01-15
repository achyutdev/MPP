package problem.C;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialsecurity;
	
	public Paycheck(double grosspay){
		this.grossPay=grosspay;
		this.fica = 0.23;
		this.state = 0.05;
		this.local = 0.01;
		this.medicare = 0.03;
		this.socialsecurity = 0.075;
	}
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialsecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialsecurity = socialsecurity;
	}

	
	
	@Override
	public String toString() {
		return "Paycheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialsecurity=" + socialsecurity + ", getGrossPay()=" + getGrossPay()
				+ ", getNetPay()=" + getNetPay() + "]";
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialsecurity() {
		return socialsecurity;
	}

	public double getNetPay(){
		return grossPay - grossPay*(fica/100)-grossPay*(state/100)-grossPay*(local/100)-grossPay*(medicare/100)-grossPay*(socialsecurity/100);
	}
}
