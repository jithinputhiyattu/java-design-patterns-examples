package learn.design.patterns.examples.behavioral.mediator;

public class User extends AbstractUser {

	public User(String name, AbstractMediator mediator) {
		super(name, mediator);
	}

	@Override
	public void sendMessage( String message) {
		mediator.sendMessage(this, message);
	}

}
