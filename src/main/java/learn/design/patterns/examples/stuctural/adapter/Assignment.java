package learn.design.patterns.examples.stuctural.adapter;

public class Assignment {
	
	Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public Assignment() {
		// TODO Auto-generated constructor stub
	}

	void write(String str) {
		pen.write(str);
	}

}
