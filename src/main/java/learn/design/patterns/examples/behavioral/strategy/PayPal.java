package learn.design.patterns.examples.behavioral.strategy;

public class PayPal implements PaymentStrategy {

	String userName;
	String password;

	public PayPal(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Payin using payPal...");

	}

}
