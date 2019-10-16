package learn.design.patterns.examples.behavioral.visitor;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public int visit(Book item) {
		System.out.println(" -5");
		return item.getPrice() - 5 ;
	}

	@Override
	public int visit(Shelf item) {
 
		
		System.out.println(" -10");
		return item.getPrice() - 10;
	}

}
