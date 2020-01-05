package decorator;

public class WereWolf implements Monster {
	@Override
	public void scare() {
		System.out.println("HOWL!");
	}
}
