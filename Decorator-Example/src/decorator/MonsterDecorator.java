package decorator;

public abstract class MonsterDecorator implements Monster {
	protected Monster decoratedMonster;
	
	public MonsterDecorator(Monster decoratedMonster) {
		this.decoratedMonster = decoratedMonster;
	}
	
	@Override
	public void scare() {
		decoratedMonster.scare();
	}
}
