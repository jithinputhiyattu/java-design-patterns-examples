package learn.design.patterns.examples.stuctural.proxy;

public class ATMProxy  implements ATMService {

	public Integer getBalance() {
		ATMService a = new ATMMachine();
		return a.getBalance();
	}

	public String getStatus() {
		ATMService a = new ATMMachine();
		return a.getStatus();
	}

}
