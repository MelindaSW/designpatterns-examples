package singleton;

public class Main {
	public static void main(String[] args) {
		HelloWorld hello = HelloWorld.getInstance();
		
		hello.sayHello();
		hello.sayWorld();
		//Hello!
		//World!
	}
}
