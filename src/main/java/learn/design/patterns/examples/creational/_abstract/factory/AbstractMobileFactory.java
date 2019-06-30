package learn.design.patterns.examples.creational._abstract.factory;

public interface AbstractMobileFactory {
	
	
	public Mobile getMobile(String ram, String os, Integer storage);
}
