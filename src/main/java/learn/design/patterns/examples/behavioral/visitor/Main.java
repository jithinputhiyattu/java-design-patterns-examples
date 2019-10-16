package learn.design.patterns.examples.behavioral.visitor;

public class Main {

	public static void main(String[] args) {
		Item[] items = new Item[] { new Book(20, "1234"), new Book(100, "5678"), new Shelf(1000, 2, "Banana"),
				new Shelf(95, 5, "Apple") };

		
		ShoppingCart sc = new ShoppingCart();
		
		int total = calculate(sc, items);
		System.out.println(total);
	}

	private static int calculate(ShoppingCart sc, Item[] items) {
		int sum = 0;
		for (Item i : items) {
			sum += i.calculate(sc);
		}

		return sum;
	}

}
