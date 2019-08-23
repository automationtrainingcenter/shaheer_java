package polymorphism;

public class RuntimePolyChild extends RuntimePolyParent {

	@Override
	public void add(String a, int b) {
		if (a.matches("^[0-9]*$")) {
			int ia = Integer.parseInt(a);
			System.out.println(ia + b);
		}else {
			System.out.println(a+b);
		}
	}
	

}
