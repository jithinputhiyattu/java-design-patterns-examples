package learn.design.patterns.examples.creational.factory;

public class Main {

	public static void main(String[] args) {

		try {
			Laptop l = LaptopFactory.getLaptop(Type.HP, "16", "500GB");
			l.show();

			Laptop l2 = LaptopFactory.getLaptop(Type.MAC, "16", "1TB");
			l2.show();
		} catch (NoSuchLaptopException e) {

			e.printStackTrace();
		}

	}
}
