package polymorphism;

public class CompileTimePolyDemo {
	
	public void add(String a, int b) {
		System.out.println(a+b);
	}
	
	
	// change type of input
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	// change the sequence of input
	public void add(int a, String b) {
		System.out.println(a+b);
	}
	
	// change the number of input
	public void add(String a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	// change the return type of the method
//	public int add(String a, int b) {
//		
//	}
	// by changing only return type of a method we can't achieve method overloading

}
