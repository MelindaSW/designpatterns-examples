
public class PenguinWillSayAnything implements Strategy {

	@Override
	public void makePenguinSay(String message) {
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
