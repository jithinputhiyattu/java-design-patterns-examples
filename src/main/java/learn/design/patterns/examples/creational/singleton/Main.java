package learn.design.patterns.examples.creational.singleton;

import java.util.Date;

public class Main {
	public static void main(String[] args) {

		System.out.println("Starting main method ..... : " + (new Date().toString()));
		
		Singleton.verify();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

	}

}
