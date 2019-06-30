package learn.design.patterns.examples.creational._abstract.factory;

public class MiPhoneFactory implements AbstractMobileFactory {

	public Mobile getMobile(String ram, String os, Integer storage) {
		// TODO Auto-generated method stub
		return new MiPhone(ram, os, storage);
	}

}
