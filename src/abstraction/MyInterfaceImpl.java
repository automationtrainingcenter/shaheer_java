package abstraction;

public class MyInterfaceImpl implements MyInterface{

	@Override
	public void methodOne() {
		System.out.println("methodOne impl");
	}

	@Override
	public void methodTwo() {
		System.out.println("methodTwo impl");
	}

	@Override
	public void methodThree() {
		System.out.println("methodThree impl");
	}
	
//	@Override
//	public static void staticMethod() {
//		System.out.println("static method of inteface");
//	}

//	@Override
//	public void defaultMethod() {
//		System.out.println("default method overriden in impl class");
//	}
	
}
