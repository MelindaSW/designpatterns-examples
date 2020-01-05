package decorator;

public class Main {
	public static void main(String[] args) {
		Monster ghost = new Ghost();
		Monster wereWolf = new WereWolf();
		Monster ghostWithReaction = new WithScareReactionDecorator(new Ghost());
		Monster wereWolfWithReaction = new WithScareReactionDecorator(new WereWolf());
		
		ghost.scare();
//		Booooo!		
		wereWolf.scare();
//		HOWL!
		ghostWithReaction.scare();
//		Booooo!
//		AAAAH!
		wereWolfWithReaction.scare();
//		HOWL!
//		AAAAH!		
	}
}
