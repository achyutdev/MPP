package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Building {
	private double maintainceCost;
	private List<Apartment> apartments = new ArrayList<>();
	
	
	public Building(double maintainceCost, List<Apartment> apartments) {
		super();
		this.maintainceCost = maintainceCost;
		this.apartments = apartments;
	}

	public double getProfit(){
		double totalRent=0;
		for (Apartment apartment : apartments) {
			totalRent+=apartment.getRent();
		}
		return totalRent - this.maintainceCost;
	}

	public double getMaintainceCost() {
		return maintainceCost;
	}


	public List<Apartment> getApartments() {
		return apartments;
	}

	public static void main(String[] args) {
		
		List<Apartment> apartments1 = new ArrayList<>(Arrays.asList(new Apartment(545.98),new Apartment(666.76),new Apartment(235.98)));
		Building bld1 = new Building(23.43, apartments1);
		System.out.println("Total profit from building 1 is "+bld1.getProfit());
		
		List<Apartment> apartments2 = new ArrayList<>(Arrays.asList(new Apartment(432.98),new Apartment(324.76),new Apartment(976.98)));
		Building bld2 = new Building(23.43, apartments2);
		System.out.println("Total profit from building 1 is "+bld2.getProfit());
	}

	
}
