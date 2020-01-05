
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public void executeStrategy(String message) {
		strategy.makePenguinSay(message);
	}
}
