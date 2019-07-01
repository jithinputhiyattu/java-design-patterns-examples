package learn.design.patterns.examples.creational.builder;

public class PhoneBuilder {
	
	Phone phone;

	public PhoneBuilder() {
		phone = new Phone();
	}

	public PhoneBuilder setOs(String os) {
		phone.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		phone.ram = ram;
		return this;
	}

	public PhoneBuilder setStorage(int storage) {
		phone.storage = storage;
		return this;
	}


	public PhoneBuilder setBattery(int battery) {
		phone.battery = battery;
		return this;
	}

	public PhoneBuilder setModel(String model) {
		phone.model = model;
		return this;
	}
	
	public Phone build() {
		return this.phone;
	}
	
}
