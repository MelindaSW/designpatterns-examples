package concreteclasses;

import factoryinterface.Disease;

public class Ebola implements Disease {
	@Override
	public void infect() {
		System.out.println("You now have Ebola!");
	}
}
