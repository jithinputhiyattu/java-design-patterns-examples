package learn.design.patterns.examples.creational._abstract.factory;

public abstract class Mobile {

	String ram;
	String os;
	Integer storage;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	public void show() {
		System.out.println("Os      : " + os);
		System.out.println("Ram     : " + ram);
		System.out.println("Storage : " + storage);
	}

}
