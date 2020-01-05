
public class PenguinWillNotSayWordsStartingWithA implements Strategy {

	@Override
	public void makePenguinSay(String message) {
		if (message.startsWith("A")) {
			System.out.println("I really do not want to say that!\n"+
								" _____ \r\n" + 
								"   \\\r\n" + 
								"    \\\r\n" + 
								"     .--.\r\n" + 
								"    |o_o |\r\n" + 
								"    |:_/ |\r\n" + 
								"   //   \\ \\\r\n" + 
								"  (|     | )\r\n" + 
								" /'\\_   _/`\\\r\n" + 
								" \\___)=(___/");
		} else {
			System.out.println(message);
			System.out.println(" _____ \r\n" + 
					"   \\\r\n" + 
					"    \\\r\n" + 
					"     .--.\r\n" + 
					"    |o_o |\r\n" + 
					"    |:_/ |\r\n" + 
					"   //   \\ \\\r\n" + 
					"  (|     | )\r\n" + 
					" /'\\_   _/`\\\r\n" + 
					" \\___)=(___/");
		}
	}
}
