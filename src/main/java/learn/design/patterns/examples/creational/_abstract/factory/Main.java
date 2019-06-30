package learn.design.patterns.examples.creational._abstract.factory;

public class Main {
	public static void main(String[] args) {
		
		Mobile iPhone  =  new IPhoneFactory().getMobile("4GB", "iOs", 64);
		iPhone.show();
		
		Mobile miPhone  =  new MiPhoneFactory().getMobile("4GB", "iOs", 64);
		miPhone.show();
	}
}
