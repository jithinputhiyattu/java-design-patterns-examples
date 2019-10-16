package learn.design.patterns.examples.behavioral.visitor;

public interface ShoppingCartVisitor {

 
	public int visit(Book item);
	public int visit(Shelf item);

}
