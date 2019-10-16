package learn.design.patterns.examples.behavioral.visitor;

public class Book implements Item {

	int price;
	String name;

	public Book(int i, String string) {
		price = i;
		name = string;
	}

	@Override
	public int calculate(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
