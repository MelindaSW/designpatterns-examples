package observer;

public class Main {

	public static void main(String[] args) {

		Subject subject = new Subject();
		
		new LowerCaseObserver(subject);
		new UpperCaseObserver(subject);
		new CrazySpacingObserver(subject);
		
		String word = "Alabaster";
		subject.setChangeling(word);

//		Output:
//		the word is now all lowercase: alabaster
//		THE WORD IS NOW ALL UPPERCASE: ALABASTER
//		The   word now    has a  pretty weird   spacing: A  l  a   b  a    s    t   e r 
	}

}
