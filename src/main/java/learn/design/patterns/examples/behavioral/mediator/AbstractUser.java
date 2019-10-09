package learn.design.patterns.examples.behavioral.mediator;

public abstract class AbstractUser {
	String name;
	AbstractMediator mediator;

	public AbstractUser(String name, AbstractMediator mediator) {
		this.name = name;
		this.mediator = mediator;
		this.mediator .addUser(this);
	}

	public abstract void sendMessage(String message);

	public void reciveMessage(String message) {
		System.out.println("[" + name + "]Message Recived : " + message);
	}

}
