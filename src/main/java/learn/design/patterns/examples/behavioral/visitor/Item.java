package learn.design.patterns.examples.behavioral.visitor;

public interface Item {
	
	public int calculate(ShoppingCartVisitor visitor);

}
