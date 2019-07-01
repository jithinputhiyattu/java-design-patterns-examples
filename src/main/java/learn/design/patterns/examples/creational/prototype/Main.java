package learn.design.patterns.examples.creational.prototype;

public class Main {

	public static void main(String[] args) {
		
		BookShop bs1 = new BookShop();
		bs1.loadBooksFromDb();
		System.out.println(bs1.toString());
		BookShop bs2 = bs1.clone();
		
		bs1.removeBook(0);
		
		System.out.println(bs1.toString());
		System.out.println(bs2.toString());
		
	}
}
