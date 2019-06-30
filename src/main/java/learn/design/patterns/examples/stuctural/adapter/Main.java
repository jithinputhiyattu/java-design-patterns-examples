package learn.design.patterns.examples.stuctural.adapter;

public class Main {

	public static void main(String[] args) {

		Assignment a = new Assignment();

		a.setPen(new PenAdapter());

		a.write("Writhing assignment from main...");

	}

}
