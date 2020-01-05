package observer;

public class CrazySpacingObserver extends Observer {

	public CrazySpacingObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		char[] word = subject.getChangeling().toCharArray();
		StringBuilder b = new StringBuilder();

		for (int i = 0; i < word.length; i++) {
			int random = (int)(Math.random() * 5);
			b.append(word[i]);
			for (int y = 0; y < random; y++) {
				b.append(" ");
			}
		}
		
		System.out.println("The   word now    has a  pretty weird   spacing: " + b.toString());
	}
}
