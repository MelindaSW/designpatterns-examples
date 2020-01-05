package decorator;

public class WithScareReactionDecorator extends MonsterDecorator {

	public WithScareReactionDecorator(Monster decoratedMonster) {
		super(decoratedMonster);
	}
	
	@Override
	public void scare() {
		decoratedMonster.scare();
		setScareReaction(decoratedMonster);
	}
	
	private void setScareReaction(Monster decoratedMonster) {
		System.out.println("AAAAH!");
	}
}
