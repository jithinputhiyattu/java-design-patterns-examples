package learn.design.patterns.examples.behavioral.strategy;

public class CreditCard  implements PaymentStrategy{
	
	String name;
	String cardNum;
	String dateExp;
	int ccv;

	public CreditCard(String name, String cardNum, String dateExp, int ccv) {
		super();
		this.name = name;
		this.cardNum = cardNum;
		this.dateExp = dateExp;
		this.ccv = ccv;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Payin using credit card...");
		
	}

}
