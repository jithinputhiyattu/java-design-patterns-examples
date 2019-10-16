package learn.design.patterns.examples.behavioral.state;

public class OnState implements State {

	@Override
	public void doAction() {
		System.out.println("Was in ON state, Turning Off...");
		
	}

}
