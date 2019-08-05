package basics;

public class Assignment {
	// write a method to find out given character is vowel or not using if else

	// write a method to verify given number is palindrome or not

	// write a method to find factorial of a given number

	// write a method to verify given number is prime or not

	// write a method to find sum and average of an array

	// write a method to search an element in an array

	// write a method to reverse the given string

	// write a method which will convert the case of alternate words of a string

	// write a method which will transpose the matrix i.e. 2*3 to 3*2

	// write a method to remove duplicates of the given string

	// create a main method and call above methods one by one in this main method

	public static void main(String[] args) {
		String s = "sunshine";
		String rs = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2 == 1) {
				rs += s.charAt(i);
			}
		}
		System.out.println(rs);
	}
}