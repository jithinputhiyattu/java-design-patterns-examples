package learn.design.patterns.examples.creational._abstract.factory;

public class IPhoneFactory implements AbstractMobileFactory{

	public Mobile getMobile(String ram, String os, Integer storage) {
		// TODO Auto-generated method stub
		return new IPhone(ram, os, storage);
	}

}
