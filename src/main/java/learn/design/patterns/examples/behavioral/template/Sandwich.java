package learn.design.patterns.examples.behavioral.template;

public abstract class Sandwich {
	
	public void prepareSandwich() {
		this.cutBread();
		this.addVegitables();
		this.addCheese();
		this.addMeat();
		this.cookSandwich();
		this.packSandwich();
	}

	private void packSandwich() {
		System.out.println("Packing sandwich....\n\n");
	}

	private void cookSandwich() {
		System.out.println("Cooking sandwich....");
	}

	protected abstract void addMeat();

	protected abstract void addCheese();

	private void addVegitables() {
		System.out.println("Adding vegitables....");
	}

	private void cutBread() {
		System.out.println("Cutting the bread....");
	}

}
