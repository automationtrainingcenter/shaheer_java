package basics;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		String s3 = " webdriver";
		String s4 = "AHALYA";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                    actual text                     ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println("number of chraracters in s1 = "+s1.length());
		System.out.println("number of characters in s2 = "+s2.length());

		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println("s1 is empty "+s1.isEmpty());
		System.out.println("s2 is empty "+s2.isEmpty());

		/* concat(): combines two given strings */
		s1 = s1.concat(s3);
		System.out.println(s1);
		System.out.println(s3);

		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals("selenium")); // false caz data is not matching
		System.out.println(s3.equals(" webdriver")); // true both data and case matching
		System.out.println(s1.equals("Selenium Webdriver"));// false only data matching but case is not matching
		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("selenium")); // false caz data is not matching
		System.out.println(s3.equalsIgnoreCase(" webdriver")); // true both data and case matching
		System.out.println(s1.equalsIgnoreCase("Selenium Webdriver"));// true data matching

		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s1.contains(s3)); //true
		System.out.println(s1.contains("nium web"));// true
		System.out.println(s1.contains("Driver"));
		
		/* toLowerCase(): converts given string to lower case */
		System.out.println(s4.toLowerCase());

		/* toUpperCase(): converts given string to upper case */
		System.out.println(s1.toUpperCase());
		
		/* charAt(): returns a character at a given index number */
		System.out.println(s1.charAt(12));// d
//		System.out.println(s3.charAt(12));// StringIndexOutOfBoundsException
		
		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s1.indexOf('w')); //9
		System.out.println(s3.indexOf('e')); //2
		System.out.println(s3.indexOf('E')); //-1
		
		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s1.startsWith("sele")); // true
		System.out.println(s3.startsWith("web")); // false
		
		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s1.endsWith("driver")); // true
		System.out.println(s3.endsWith("Driver")); // false
		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s5.replace("Java", "Python"));

		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values Note: substring() will include the beginning
		 * index character and excludes ending index character
		 */
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(4, 12));
		
		/* toCharArray() return an array of characters inside the given string */
		char[] chars = s4.toCharArray();
		System.out.println(chars.length);
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		System.out.println(words.length);
		System.out.println(words[0]);

		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println(s6);
		s6 = s6.trim();
		System.out.println(s6);
	}

}
