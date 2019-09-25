package learn.design.patterns.examples.stuctural.facade;

public class ATMMachine {
	
	int balance;
	int status;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public boolean deposit(float amount) {
 
		return true;
	}
	public boolean withdraw(float amount) {
		 
		return true;
	}
}
