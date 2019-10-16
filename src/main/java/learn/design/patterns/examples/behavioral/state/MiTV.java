package learn.design.patterns.examples.behavioral.state;

public class MiTV {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void powerButtonPressed() {
		state.doAction();
	}
}
