package learn.design.patterns.examples.creational.factory;

public abstract class Laptop {
	
	String name;
	String hd;
	String ram;

	public abstract String getName();
	public abstract String getHd();
	public abstract String getRam();
	
	
	public void show(){
		System.out.println("Name : " + name);
		System.out.println("Ram  : " + ram);
		System.out.println("Hd   : " + hd);
		
	}
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

}
