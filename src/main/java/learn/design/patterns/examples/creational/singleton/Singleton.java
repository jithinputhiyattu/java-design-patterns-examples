package learn.design.patterns.examples.creational.singleton;

import java.util.Date;

public class Singleton {
	
	
	int a;
	
	
	public static void verify() {
		System.out.println("verify method..... : " + (new Date().toString()));

	}

	private Singleton() {
		System.out.println("Singleton constructor..... : " + (new Date().toString()));
	}

	private static class InnerClass {
		private InnerClass() {
			
		}

		private static final Singleton INSTANCE = new Singleton();

	}

	public static Singleton getInstance() {
		return InnerClass.INSTANCE;
	}

}
