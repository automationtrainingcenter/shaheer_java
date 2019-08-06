package classesandobjects;
/*
 * Method is a collection of statements which are combined together to perform
 * specific task. Collection of statements in java are also known as block.
 * In Java we can define block using { and }.
 * Inside the { and } we are going write multiple statement to achieve desired
 * functionality.
 * 
 * Method contains 3 parts
 * Method declaration or method head
 * method body or method definition
 * method call
 * 
 * 1 Method declaration or Method head
 * it is nothing but name of a method with the input it is accepting and output type
 * it is going to return.
 * 
 * syntax:
 * 
 * access_modifiers static(optional) return_type method_name(arg1, arg2, arg3 ... argN)
 * 
 * here arg1, arg2, arg3 ... argN are the variables of some type we are passing
 * as input to the method, return_type is the data_type of the output of the method.
 * if the method does not have output then the return type of the method is void
 * arguments are optional
 * 
 * 2 Method body or Method definition:
 * These are the statements of the method to achieve desired functionality
 * syntax:
 * 	{
 * 		statement 1;
 * 		statement 2;
 * 		statement 3;
 * 		.
 * 		.
 * 		.
 * 		statement N;
 * 	}
 * 
 * 3 Method call
 * to execute the statements inside the method body we have to call the method
 * to call an instance method of a class we have to create an object of the class
 * and to call a static method of the class we can use class name.
 * 
 * syntax:
 * return_type var_name = method_name(para1, para2, para3, .... paraN);
 * 
 * here para1, para2, para3 ... paraN are input data to the method and 
 * return_type var_name is the output of the method
 * these both are optional.
 * 
 * There are 4 types of methods based on input and output
 * 1. method without input and without output
 * 2. method without input and with output
 * 3. method with input and without output
 * 4. method with input and with output
 */

public class MethodsDemo {
	
	// method without input and without output
	public void methodOne() {
		System.out.println("this is method without input and without output");
	}
	
	
	// method without input and with output
	public boolean methodTwo() {
		System.out.println("this is method two without input and with boolean output");
		// to return output we have to use return keyword
		return true;
	}
	
	
	// method with input and without output
	public void methodThree(String arg1) {
		System.out.println("this is method three with string input and without output");
		System.out.println("input arg1 is "+arg1);
	}
	
	// method with input and with output
	public int methodFour(int a, int b) {
		System.out.println("this is method four with two integer inputs and with an integer output");
		System.out.println("input  a is "+a+" input b is "+b);
		System.out.println("the output is sum of a and b ");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		boolean r1 = obj.methodTwo();
		System.out.println(r1);
		obj.methodThree("sunshine");
		int r2 = obj.methodFour(10, 20);
		System.out.println(r2);
	}
	
	
	

}
