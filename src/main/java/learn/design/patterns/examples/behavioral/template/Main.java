package learn.design.patterns.examples.behavioral.template;

public class Main {
	
	public static void main(String[] args) {
		Sandwich veg = new VegSandwich();
		Sandwich nonveg = new ChikenSandwich();
		
		veg.prepareSandwich();
		nonveg.prepareSandwich();
	}
}
