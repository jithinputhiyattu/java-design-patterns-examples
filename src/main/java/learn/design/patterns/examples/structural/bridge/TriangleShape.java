package learn.design.patterns.examples.structural.bridge;

public class TriangleShape extends Shape {

	public TriangleShape(Colour c) {
		super(c);
	 
	}

	public void drawShape() {
		System.out.println("Drawing triangle .....");
		c.applayColour();
		
	}

}
