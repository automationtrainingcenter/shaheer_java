package abstraction;

public class OuterInnerImpl implements Outer, Outer.Inner{

	@Override
	public void methodOne() {
		System.out.println("Outer interface methodOne implementation");
	}

	@Override
	public void methodTwo() {
		System.out.println("Inner interface methodTwo implementation");
	}

	@Override
	public Inner method() {
		return this;
	}
	
	
	
	

}
