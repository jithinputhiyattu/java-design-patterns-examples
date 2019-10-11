package learn.design.patterns.examples.behavioral.chainof.responsibility;

public abstract class DispenseChain {

	int count;
	int value;
	DispenseChain nextChain;

	public DispenseChain(int count, int value, DispenseChain nextChain) {
		super();
		this.count = count;
		this.value = value;
		this.nextChain = nextChain;
	}

	public DispenseChain getNextChain() {
		return nextChain;
	}

	void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	void dispense() {
		System.out.println("Dispencing + [ " + this.value + " * " + this.getCount() + " ]");

	}

	int getCount() {
		return count;
	}

	void setCount(int i) {
		count = i;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
