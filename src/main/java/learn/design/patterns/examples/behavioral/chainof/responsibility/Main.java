package learn.design.patterns.examples.behavioral.chainof.responsibility;

public class Main {

	public static void main(String[] args) {
		ATMDispenser atm = new ATMDispenser();
		atm.dispense(3700);
	}

}
