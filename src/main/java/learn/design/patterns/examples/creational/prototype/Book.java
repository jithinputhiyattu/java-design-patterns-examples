package learn.design.patterns.examples.creational.prototype;

public class Book {
	
	String title;
	String publisher;
	Integer price;

	public Book(String title, String publisher, int price) {
		this.title = title;
		this.publisher = publisher;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{title: " + title + ", publisher: " + publisher + ",price: " + price + " }";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

}
