package learn.design.patterns.examples.behavioral.state;

public class Main {

	public static void main(String[] args) {

		OnState on = new OnState();
		OffState off = new OffState();

		MiTV tv = new MiTV();
		tv.setState(off);
		tv.powerButtonPressed();
		tv.setState(on);
		tv.powerButtonPressed();
	}

}
