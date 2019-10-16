package learn.design.patterns.examples.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		sc.setTotal(2400);;
		sc.pay(new CreditCard("", "", "", 499));
		
		
		
		ShoppingCart scc = new ShoppingCart();
		scc.setTotal(2400);;
		scc.pay(new PayPal("", ""));
		
	}

}
