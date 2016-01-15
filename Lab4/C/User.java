package problem.C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>(Arrays.asList(
				new Order(101,LocalDate.now(), 2903),
				new Order(101,LocalDate.now(), 2999),
				new Order(101,LocalDate.now(), 903),
				new Order(101,LocalDate.now(), 875))
				);
				
		Employee p1 = new Hourly(2001, 20, 23);
		Employee p2 = new Salaried(2002, 2000);
		Employee p3 = new Commissioned(2003, 5, 2000, orders);
		
		Paycheck check1 = p1.calcCompensation(2);
		System.out.println(p1);
		System.out.println(check1);
		
		Paycheck check2 = p2.calcCompensation(4);
		System.out.println(p1);
		System.out.println(check2);
		
		Paycheck check3 = p3.calcCompensation(12);
		System.out.println(p1);
		System.out.println(check3);
	}

}
