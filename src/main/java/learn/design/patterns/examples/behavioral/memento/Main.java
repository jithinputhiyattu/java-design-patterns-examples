package learn.design.patterns.examples.behavioral.memento;

public class Main {

	public static void main(String[] args) {

		Article a = new Article("Hello", "Hello world");

		CareTaker ct = new CareTaker();

		System.out.println(a);
		ct.add(a.save());

		a.setCaption("Jithin");
		ct.add(a.save());
		System.out.println(a);

		a.setContent("Puthiyattu");
		ct.add(a.save());
		System.out.println(a);

		System.out.println("----------------------------------------");

		a.restore(ct.pop());
		System.out.println(a);
		a.restore(ct.pop());
		System.out.println(a);
		a.restore(ct.pop());
		System.out.println(a);

	}
}
