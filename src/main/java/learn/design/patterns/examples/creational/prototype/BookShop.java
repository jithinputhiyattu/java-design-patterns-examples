package learn.design.patterns.examples.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	@Override
	public String toString() {

		return books.toString();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	List<Book> books;

	public BookShop() {

		books = new ArrayList<Book>();
	}

	public void loadBooksFromDb() {

		for (int i = 1; i <= 10; i++) {

			books.add(new Book("Book name " + i, "Book name " + i, 250 + i));
		}
	}

	@Override
	public BookShop clone() {
		BookShop bs = new BookShop();

		for (int i = 0; i < this.books.size(); i++) {
			bs.books.add(this.books.get(i));
		}

		return bs;

	}

	public void removeBook(int i) {
		this.books.remove(i);
		
	}
}
