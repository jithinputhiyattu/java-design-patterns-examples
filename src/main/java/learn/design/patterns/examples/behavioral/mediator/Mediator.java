package learn.design.patterns.examples.behavioral.mediator;

public class Mediator extends AbstractMediator {

	@Override
	public void sendMessage(AbstractUser u, String message) {
		for (AbstractUser user : userList) {
			if (user != u) {
				user.reciveMessage(message);
			}
		}

	}

	@Override
	public void addUser(AbstractUser u) {
		userList.add(u);
	}

}
