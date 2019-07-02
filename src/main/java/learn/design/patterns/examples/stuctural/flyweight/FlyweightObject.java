package learn.design.patterns.examples.stuctural.flyweight;

public class FlyweightObject {
	
	ObjectType type;
	
	static int count = 0;
	
	public FlyweightObject(ObjectType type) {
		this.type = type;
		System.out.println("Creating new FlyweightObject " + count++);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void performAction() {
		System.out.println("FlyweightObject is performing some action..." + type);
	}
}
