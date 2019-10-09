package learn.design.patterns.examples.behavioral.observer;

public class Student implements  Observer{

	
	Subject sub;
	
	
	@Override
	public void update() {
		String msg = (String) sub.getUpdate(this);
		System.out.println("Recived an update : " + msg);
		
	}

	@Override
	public void setSubject(Subject sub) {
		this.sub =  sub;
		
	}

}
