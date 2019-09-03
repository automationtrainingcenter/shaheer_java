package abstraction;

public interface MyInterface {
	
	void methodOne();
	
	void methodTwo();
	
	void methodThree();
	
	// from Java 8 an interface can have a static method  and a default method with definitions
	//static method
	public static void staticMethod() {
		System.out.println("static method of inteface");
	}
	
	// default method
	public default void defaultMethod() {
		System.out.println("default method of interface");
	}

}
