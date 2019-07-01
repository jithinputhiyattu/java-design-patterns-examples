package learn.design.patterns.examples.creational.builder;

public class Phone {

	String os;
	int ram;
	int storage;
	int battery;
	String model;
	
	
	protected Phone() {
		super();
		
	}
	

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", storage=" + storage + ", battery=" + battery + ", model=" + model
				+ "]";
	}


	public Phone(String os, int ram, int storage, int battery, String model) {
		super();
		this.os = os;
		this.ram = ram;
		this.storage = storage;
		this.battery = battery;
		this.model = model;
	}
}
