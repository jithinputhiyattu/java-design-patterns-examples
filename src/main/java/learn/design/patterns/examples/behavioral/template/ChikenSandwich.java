package learn.design.patterns.examples.behavioral.template;

public class ChikenSandwich extends Sandwich {

	@Override
	protected void addMeat() {
		System.out.println("Adding meat to chiken sandwich....");
	}

	@Override
	protected void addCheese() {
		System.out.println("Adding cheese to non veg sandwich....");
		
	}

}
