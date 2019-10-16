package learn.design.patterns.examples.behavioral.interpreter;

public class Main {

	public static void main(String[] args) {

		InterpreterContext ic = new InterpreterContext();

		ToBinary b = new ToBinary();
		b.setI(45);
		System.out.println(b.interpreter(ic));

		ToHex h = new ToHex();
		h.setI(45);
		System.out.println(h.interpreter(ic));
	}

}
