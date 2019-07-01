package learn.design.patterns.examples.stuctural.proxy;

public class ATMMachine implements ATMService {
	Integer balance;
	String status;
	
	public Integer getBalance() {
		return balance;
	}
	private void setBalance(int balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
