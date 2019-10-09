package learn.design.patterns.examples.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		
		MySubject s = new MySubject();
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.setSubject(s);
		s2.setSubject(s);
		s3.setSubject(s);
		s4.setSubject(s);
		
		s.register(s1);
		s.register(s2);
		s.register(s3);
		s.register(s4);
		
		
		s.postMessage("Hello world");

	}

}
