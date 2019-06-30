package learn.design.patterns.examples.creational.factory;

public class LaptopFactory {

	public static Laptop getLaptop(Type type, String ram, String hd) throws NoSuchLaptopException {
		Laptop laptop = null;

		switch (type) {
			case HP: {
				laptop = new HP(ram, hd);
	
				break;
			}
			case MAC: {
				laptop = new Mac(ram, hd);
				break;
			}
			default: {
				throw (new NoSuchLaptopException("NoSuchLaptopException : " + type.toString()));
			}
		}
		return laptop;
	}

}
