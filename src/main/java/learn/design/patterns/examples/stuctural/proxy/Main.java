package learn.design.patterns.examples.stuctural.proxy;

public class Main {

	public static void main(String[] args) {
		ATMProxy atm = new ATMProxy();
		atm.getBalance();
	}

}
