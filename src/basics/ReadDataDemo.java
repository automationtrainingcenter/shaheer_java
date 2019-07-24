package basics;

import java.util.Scanner;

/*
 * Scanner class is used to read data from the console. 
 * Scanner class provides several methods to read different types of data
 * all these methods are instance methods 
 * syntax to create Scanner class object
 * Scanner scObj = new Scanner(System.in)
 */

public class ReadDataDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// to read a string with multiple words we have to use nextLine()
		System.out.println("please enter a string with multiple words");
		String mstr = sc.nextLine();
		System.out.println("you entered string value as " + mstr);
		
		// read boolean data
		System.out.println("please enter boolean data");
		// to read boolean data we have to use nextBoolean()
		boolean boolValue = sc.nextBoolean();
		System.out.println("you entered boolean value as " + boolValue);

		// read int data
		// to read integer data we have to use nextInt()
		System.out.println("please enter a integer value");
		int iValue = sc.nextInt();
		System.out.println("you entered integer value as " + iValue);

		// read float data
		// to read float data we have to use nextFloat()
		System.out.println("please enter a float value");
		float fValue = sc.nextFloat();
		System.out.println("you entered float value as " + fValue);

		// read long value
		// to read long data we have to use nextLong()
		System.out.println("please enter a long value");
		long lValue = sc.nextLong();
		System.out.println("you entered long value as " + lValue);

		// read a string value
		System.out.println("please enter a string value");
		String str = sc.next();
		System.out.println("you enter string value as " + str);
		
		// to read a character Scanner class does not have direct method
		// read a character using next() which returns a String and get the
		// character at index 0 of that string
		System.out.println("enter a character");
		String s = sc.next();
		char ch = s.charAt(0);
		System.out.println("you entered character value as "+ch);

	}

}
