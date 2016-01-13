package lab2.problem2.B;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Order order			= new Order();
		List<OrderLine> list = new ArrayList<OrderLine>();
		
		OrderLine orderline1 = new OrderLine();
		OrderLine orderline2 = new OrderLine();
		OrderLine orderline3 = new OrderLine();
		
		list.add(orderline1);
		list.add(orderline2);
		list.add(orderline3);
		
		order.setOrderNum(1);
		order.setOrderlines(list);
		
		System.out.println("Order no is "+order.getOrderNum()+" and number of orderlines "+order.getOrderlines().size());
		
		
		orderline1.setOrder(order);
		
		System.out.println("\nOrder no is "+orderline1.getOrder().getOrderNum()+" and number of orderlines "+orderline1.getOrder().getOrderlines().size());
		
	}

}
