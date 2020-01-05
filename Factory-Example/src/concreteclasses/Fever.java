package concreteclasses;

import factoryinterface.Disease;

public class Fever implements Disease {
	@Override
	public void infect() {
		System.out.println("You now have a fever!");
	} 
}
