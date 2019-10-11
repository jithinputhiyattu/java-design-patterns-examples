package learn.design.patterns.examples.behavioral.chainof.responsibility;

public class ATMDispenser {
	INR2000DipenseChain inr2000;

	public ATMDispenser() {
		super();
		inr2000 = new INR2000DipenseChain();

		inr2000.setNextChain(new INR500DipenseChain());

		inr2000.getNextChain().setNextChain(new INR100DipenseChain());
	}

	public void dispense(int amount) {

		DispenseChain chain = inr2000;

		while (chain != null) {
			chain.setCount(amount / chain.getValue());
			int balance = amount % chain.getValue();
			chain.dispense();
			if (balance == 0) {
				break;
			}
			amount = balance;
			chain = chain.getNextChain();

		}

	}

}
