package singleton;

public class HelloWorld {
	
	private static HelloWorld helloWorldInstance = new HelloWorld();
	
	private HelloWorld() {}
	
	public static HelloWorld getInstance() {
		return helloWorldInstance;
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	public void sayWorld() {
		System.out.println("World!");
	}
}
