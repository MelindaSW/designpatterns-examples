
public class Main {

	public static void main(String[] args) {
		
		Context context = new Context(new PenguinWillNotSayWordsStartingWithA());
		context.executeStrategy("Art");
		context.executeStrategy("Book");
		
		context = new Context(new PenguinWillSayAnything());
		context.executeStrategy("Anything");
				
	}
}
// Output:

//I really do not want to say that!
//_____ 
//  \
//   \
//    .--.
//   |o_o |
//   |:_/ |
//  //   \ \
// (|     | )
///'\_   _/`\
//\___)=(___/
//Book
//_____ 
//  \
//   \
//    .--.
//   |o_o |
//   |:_/ |
//  //   \ \
// (|     | )
///'\_   _/`\
//\___)=(___/
//Anything
//_____ 
//  \
//   \
//    .--.
//   |o_o |
//   |:_/ |
//  //   \ \
// (|     | )
///'\_   _/`\
//\___)=(___/

