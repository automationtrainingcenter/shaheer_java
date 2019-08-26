package finalkeyword;
/*
 * we can declare a variable, method or class as final
 * if we declare variable as final then we can't change it's value
 * if we declare a method as final then we can't override that method in child class
 * if we declare a class as final then we can't create child class to that class but
 * it can have a parent class
 */

public class FinalKeywordDemo {
	static final float PI = 3.14f;
	
	public static void main(String[] args) {
		System.out.println(PI);
//		PI = 6.9f;
	}
}
