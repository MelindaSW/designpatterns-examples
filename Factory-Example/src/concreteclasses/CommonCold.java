package concreteclasses;

import factoryinterface.Disease;

public class CommonCold implements Disease {
	@Override
	public void infect() {
		System.out.println("You now have a common cold!");
	}	
}
