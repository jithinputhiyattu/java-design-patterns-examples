package learn.design.patterns.examples.structural.bridge;

public class Main {

	public static void main(String[] args) {
		
		Shape shape = new TriangleShape(new RedColour());
		shape.drawShape();

	}

}
