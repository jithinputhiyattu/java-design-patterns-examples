package learn.design.patterns.examples.behavioral.state;

public class OffState implements State {

	@Override
	public void doAction() {
		System.out.println("Was in off state Turning ON...");
		
	}

}
