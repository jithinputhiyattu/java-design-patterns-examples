package learn.design.patterns.examples.creational.factory;

public class NoSuchLaptopException extends Exception {
	
	private String message;

	NoSuchLaptopException(String s) {

		this.message = s;
	}
	
	
	public String getMessage() {
		return this.message ;
	}

}
