package learn.design.patterns.examples.stuctural.flyweight;

import java.util.HashMap;

public class FlyweigtFactory {
	
	
	static HashMap<ObjectType, FlyweightObject> map = new HashMap<ObjectType, FlyweightObject>();

	public static FlyweightObject getFObject(ObjectType t) {
		
		FlyweightObject fo = map.get(t);
		if (fo == null) {
			FlyweightObject f = new  FlyweightObject(t);
			map.put(t, f);
			return f;
		}
		return fo;
	}

}
