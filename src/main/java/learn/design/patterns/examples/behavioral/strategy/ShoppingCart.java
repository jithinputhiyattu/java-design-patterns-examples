package learn.design.patterns.examples.behavioral.strategy;

public class ShoppingCart {
	
	//List<Items> items;
	
	int total;
	
	
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	void pay(PaymentStrategy payment) {
		payment.pay(total);
	}

}
