package learn.design.patterns.examples.creational.factory;

public class Mac extends Laptop {

	public Mac(String ram, String hd) {
		this.name = "MacBook Pro";
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
