package learn.design.patterns.examples.behavioral.chainof.responsibility;

public class INR100DipenseChain extends DispenseChain {

	public INR100DipenseChain() {
		super(0, 100, null);
		this.value = 100;
	}

}
