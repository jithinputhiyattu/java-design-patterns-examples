package learn.design.patterns.examples.behavioral.interpreter;

public class ToHex implements Expression {

	int i;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String interpreter(InterpreterContext ic) {
		// TODO Auto-generated method stub
		return ic.getHexadecimalFormat(i);
	}

}
