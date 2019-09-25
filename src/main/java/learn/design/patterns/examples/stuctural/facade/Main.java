package learn.design.patterns.examples.stuctural.facade;

public class Main {
	
	public static void main(String[] args) {
		ATMFacade af = new ATMFacade();
		af.deposit(9930000, 350000);
		af.withdraw(9930000, 3500, 2000);
	}
}
