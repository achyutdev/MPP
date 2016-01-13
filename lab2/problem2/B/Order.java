package lab2.problem2.B;

import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> orderlines;
	
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}
	
	
}
