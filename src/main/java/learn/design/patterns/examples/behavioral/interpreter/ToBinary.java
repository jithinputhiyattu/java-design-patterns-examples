package learn.design.patterns.examples.behavioral.interpreter;

public class ToBinary implements Expression {

	int i;

	@Override
	public String interpreter(InterpreterContext ic) {
		// TODO Auto-generated method stub
		return ic.getBinaryFormat(i);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
