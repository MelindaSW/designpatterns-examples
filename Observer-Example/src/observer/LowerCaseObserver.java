package observer;

public class LowerCaseObserver extends Observer {

	public LowerCaseObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("the word is now all lowercase: " + subject.getChangeling().toLowerCase());
	}

}
