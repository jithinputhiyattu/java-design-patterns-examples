package learn.design.patterns.examples.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMediator {

	List<AbstractUser> userList;

	public AbstractMediator() {
		userList = new ArrayList<AbstractUser>();
	}

	public abstract void sendMessage(AbstractUser u, String message);

	public abstract void addUser(AbstractUser abstractUser);

}
