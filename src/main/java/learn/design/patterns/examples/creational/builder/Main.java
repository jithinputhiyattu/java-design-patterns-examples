package learn.design.patterns.examples.creational.builder;

public class Main {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setModel("2019").setBattery(4500).setOs("Android").build();
		System.out.println(phone.toString());
	}
}
