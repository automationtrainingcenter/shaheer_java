package finalkeyword;

public class FinalMethodChild extends FinalMethodParent{
	@Override
	public void methodOne() {
		System.out.println("this is normal method in child class");
	}
	
//	@Override
//	public void methodTwo() {
//		System.out.println("this is final method in parent class");
//	}
	// if we declare any method as final we can't override the final methods

}
