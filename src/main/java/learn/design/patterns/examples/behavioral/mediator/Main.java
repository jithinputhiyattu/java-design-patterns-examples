package learn.design.patterns.examples.behavioral.mediator;

public class Main {

	public static void main(String[] args) {

		AbstractMediator medioter = new Mediator();

		AbstractUser u1 = new User("A", medioter);
		AbstractUser u2 = new User("B", medioter);
		AbstractUser u3 = new User("C", medioter);
		AbstractUser u4 = new User("D", medioter);

		u1.sendMessage("Hi all, my name is A");

	}

}
