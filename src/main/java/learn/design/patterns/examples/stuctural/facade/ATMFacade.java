package learn.design.patterns.examples.stuctural.facade;

public class ATMFacade {

	ATMMachine atm;
	BankService bank;

	public ATMFacade() {
		atm = new ATMMachine();
		bank = new BankService();
	}

	public void deposit(int acountNumber, float amount) {
		
		if(bank.validateAccount(acountNumber)){
			if(atm.deposit(amount)) {
				bank.deposit(acountNumber, amount);
			}
		}
	}

	public void withdraw(int acountNumber, int pin, float amount) {
		
		if(bank.validateAccount(acountNumber, pin)){
			if(atm.withdraw(amount)) {
				bank.withdraw(acountNumber, amount);
			}
		}

	}

}
