package learn.design.patterns.examples.stuctural.composite;

public class Cabinet extends NonLeaf implements Component {

	@Override
	public void showPice() {
		System.out.println("Cabinet component");
		this.getLeaf().forEach(i -> i.showPice());
	}

}
