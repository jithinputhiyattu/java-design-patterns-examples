package learn.design.patterns.examples.stuctural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		List<ObjectType> al = new ArrayList<ObjectType>();
		al.add(ObjectType.A);
		al.add(ObjectType.B);
		al.add(ObjectType.A);
		al.add(ObjectType.C);
		al.add(ObjectType.A);
		al.add(ObjectType.E);
		al.add(ObjectType.D);		
		al.add(ObjectType.A);
		al.add(ObjectType.B);
		al.add(ObjectType.A);
		al.add(ObjectType.C);
		al.add(ObjectType.A);
		al.add(ObjectType.E);
		al.add(ObjectType.D);
		al.add(ObjectType.A);
		al.add(ObjectType.B);
		al.add(ObjectType.A);
		al.add(ObjectType.C);
		al.add(ObjectType.A);
		al.add(ObjectType.E);
		al.add(ObjectType.D);
		
		al.forEach((t) -> {
			FlyweightObject fo = FlyweigtFactory.getFObject(t);
			fo.performAction();
		});
	}

}
