package exception_handling;
/*
 * Exception means interruption to the normal flow of execution.
 * Generally we have two types of exceptions
 * 1. checked exceptions also known compile time exception
 * 		These are the exceptions which will extends Exception class
 * 	 we can handle checked exception either by throwing that exception or by handling that exception using
 * try and catch blacks
 * 
 * 2. unchecked exceptions also known as runtime exception
 * 		These are the exceptions which will extends RuntimeException class
 * 	we can handle unchecked exception using try and catch block
 * 
 * try block contains the code which will rise an exception
 * 
 * catch block will catch that exception and handles that exception
 * 
 * finally block will execute the statement irrespective of exception
 * 
 * throws keyword will throw the exception to the corresponding method declaration
 *
 */

public class ExceptionsDemo {

	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		try {
			System.out.println(vowels[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("array index number must be less than "+vowels.length);
			System.out.println(e.getMessage());
		}
		String name = "sunshine";
		try {
			System.out.println(Integer.parseInt(name));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		int i = 12;
		try {
			System.out.println(i / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
