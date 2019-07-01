package learn.design.patterns.examples.stuctural.composite;

public class MotherBoard  extends NonLeaf implements Component  {
	
	public void showPice() {
		System.out.println("Mother board");
		this.getLeaf().forEach(i->i.showPice());
	}

}
