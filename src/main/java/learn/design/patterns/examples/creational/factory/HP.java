package learn.design.patterns.examples.creational.factory;

public class HP extends Laptop {

	public HP(String ram, String hd) {
		this.name = "HP NoteBook";
		this.hd = hd;
		this.ram = ram;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getHd() {
		// TODO Auto-generated method stub
		return this.hd;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}
	
	

}
