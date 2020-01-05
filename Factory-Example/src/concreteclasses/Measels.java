package concreteclasses;

import factoryinterface.Disease;

public class Measels implements Disease {
	@Override
	public void infect() {
		System.out.println("You now have measels!");
	}
}
