package learn.design.patterns.examples.structural.bridge;

public abstract class Shape {

	Colour c;

	public Shape(Colour c) {
		this.c = c;

	}

	public abstract void drawShape();
}
