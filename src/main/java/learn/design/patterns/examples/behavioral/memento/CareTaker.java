package learn.design.patterns.examples.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Memento> store;
	int index;

	public CareTaker() {
		super();
		store = new ArrayList<>();
		index = 0;
	}

	public boolean add(Memento m) {

		index++;
		return store.add(m);
	}

	public Memento pop() {

		return store.get(--index);

	}

}
