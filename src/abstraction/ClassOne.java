package abstraction;

public class ClassOne implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("method one Of IntefaceOne implementation in Classone");
	}

	@Override
	public void methodTwo() {
		System.out.println("method two of InterfaceTwo implementation on ClassOne");
	}


}
