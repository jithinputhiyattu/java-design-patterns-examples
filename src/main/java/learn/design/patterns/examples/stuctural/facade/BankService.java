package learn.design.patterns.examples.stuctural.facade;

public class BankService {
	
	

	public boolean validateAccount(int acountNumber) {

		return true;
	}

	public void deposit(int acountNumber, float amount) {
		
		System.out.println("Deposite " + amount + " to account " + acountNumber);
		
	}

	public void withdraw(int acountNumber, float amount) {
		System.out.println("Witdraw " + amount + " to account " + acountNumber);
		
	}

	public boolean validateAccount(int acountNumber, int pin) {
		return true;
	}

}
