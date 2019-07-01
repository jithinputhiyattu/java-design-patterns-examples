package learn.design.patterns.examples.stuctural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class NonLeaf implements Component {

	List<Component> leaf;

	public List<Component> getLeaf() {
		return leaf;
	}

	public NonLeaf() {
		leaf = new ArrayList<Component>();
	}

	public void addComponent(Component co) {
		leaf.add(co);
	}

}
