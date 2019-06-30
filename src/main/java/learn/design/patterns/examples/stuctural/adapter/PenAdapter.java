package learn.design.patterns.examples.stuctural.adapter;

public class PenAdapter implements Pen {
	
	
	Chock chock;
	

	public PenAdapter() {
		chock = new Chock();
	}

	public void write(String str) {
		chock.write(str);
		
	}

}
