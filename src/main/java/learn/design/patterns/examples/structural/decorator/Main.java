package learn.design.patterns.examples.structural.decorator;

public class Main {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();

	}

}
