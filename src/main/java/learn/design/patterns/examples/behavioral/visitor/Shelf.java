package learn.design.patterns.examples.behavioral.visitor;

public class Shelf implements Item {

	int price;
	String theame;
	int modelNo;

	public Shelf(int i, int j, String string) {
		price = i;
		modelNo = j;
		theame = string;
	}

	@Override
	public int calculate(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
