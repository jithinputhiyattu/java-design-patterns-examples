package learn.design.patterns.examples.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject {

	private final Object MUTEX = new Object();
	String message;
	private boolean changed;

	List<Observer> observerList;

	public MySubject() {
		super();
		changed = false;
		observerList = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {

		synchronized (MUTEX) {
			observerList.add(obj);
		}

	}

	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
			observerList.remove(obj);
		}

	}

	@Override
	public void notifyObservers() {
		List<Observer> listLocal = null;
		synchronized (MUTEX) {

			if (!changed)
				return;
			changed = false;
			listLocal = new ArrayList<>(observerList);

		}

		for (Observer o : listLocal) {
			o.update();
		}

	}

	@Override
	public Object getUpdate(Observer obj) {

		return this.message;
	}

	public void postMessage(String ms) {
		this.message = ms;
		this.changed = true;
		this.notifyObservers();

	}

 

}
