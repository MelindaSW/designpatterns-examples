package decorator;

public class Ghost implements Monster {
	@Override
	public void scare() {
		System.out.println("Booooo!");
	}
}
