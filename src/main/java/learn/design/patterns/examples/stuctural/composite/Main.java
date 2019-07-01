package learn.design.patterns.examples.stuctural.composite;

public class Main {

	public static void main(String[] args) {
		
		Component ram = new Ram();
		Component hd = new HardDrive();
		
		NonLeaf mb = new MotherBoard();
		NonLeaf cabinet = new Cabinet();
		
		mb.addComponent(ram);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		cabinet.showPice();
	}
}
