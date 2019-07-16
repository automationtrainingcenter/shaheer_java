package basics;
/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 * 	
 * 2. reference
 * 		Arrays
 * 		Strings
 * 
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 * 
 * 	WCData_type obj_name = new WCData_type(value);
 * 
 * 	Type Casting: converting one type of data to another type of data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 * 
 * 	Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 * 
 * 
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 * 
 * variable is nothing but name of memory location where we are storing data
 */


public class DataTypesDemo {
	
	public static void main(String[] args) {
		//boolean
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		
		//character
		/*
		 * to store character data we have to use single quote(')
		 * characters in Java occupies 2 bytes of memory to support
		 * unicode formatting
		 */
		char ch = 'a';
		System.out.println("character value is "+ch);
		System.out.println("min value of character is "+Character.MIN_VALUE);
		System.out.println("max value of character is "+Character.MAX_VALUE);
		System.out.println("character size in bits is "+Character.SIZE);
		System.out.println("character size is bytes is "+Character.BYTES);
		System.out.println("#########################################");
		//byte
		byte by = 120;
		System.out.println("byte value is "+by);
		System.out.println("min value of byte is "+Byte.MIN_VALUE);
		System.out.println("max value of byte is "+Byte.MAX_VALUE);
		System.out.println("byte variable size in bits is "+Byte.SIZE);
		System.out.println("byte variable size in bytes is "+Byte.BYTES);
		System.out.println("#########################################");
		
		//short 
		short sh = 2134;
		System.out.println("short value is "+sh);
		System.out.println("min value of short is "+Short.MIN_VALUE);
		System.out.println("max value of short is "+Short.MAX_VALUE);
		System.out.println("short variable size in bits is "+Short.SIZE);
		System.out.println("short variable size in bytes is "+Short.BYTES);
		System.out.println("#########################################");
		
		//int
		int i = 1234567;
		System.out.println("integer value is "+i);
		System.out.println("min value of int is "+Integer.MIN_VALUE);
		System.out.println("max value of int is "+Integer.MAX_VALUE);
		System.out.println("int variable size in bits is "+Integer.SIZE);
		System.out.println("int variable size in bytes is "+Integer.BYTES);
		System.out.println("#########################################");
		
		
		//long
		long l = 123456780988l;
		System.out.println("long value is "+l);
		System.out.println("min value of long is "+Long.MIN_VALUE);
		System.out.println("max value of long is "+Long.MAX_VALUE);
		System.out.println("long variable size in bits is "+Long.SIZE);
		System.out.println("long variable size in bytes is "+Long.BYTES);
		System.out.println("#########################################");
		
		//float
		float f = 12.33f;
		System.out.println("float value is "+f);
		System.out.println("min value of float is "+Float.MIN_VALUE);
		System.out.println("max value of float is "+Float.MAX_VALUE);
		System.out.println("float variable size in bits is "+Float.SIZE);
		System.out.println("float variable size in bytes is "+Float.BYTES);
		System.out.println("#########################################");
		
		//double 
		double d = 123.4567;
		System.out.println("double value is "+d);
		System.out.println("min value of double is "+Double.MIN_VALUE);
		System.out.println("max value of double is "+Double.MAX_VALUE);
		System.out.println("Double variable size in bits is "+Double.SIZE);
		System.out.println("Double variable size in bytes is "+Double.BYTES);
		System.out.println("#########################################");
		
		
		
		//type casting
		//up casting: lower to higher
		short shl =12345;
		int iHigh = shl;
		System.out.println("short to int "+iHigh);
		
		float fHigh = shl;
		System.out.println("short to float "+fHigh);
		
		
		float fl = 123.456f;
		double dh = fl;
		System.out.println("float to double "+dh);
		
		//down casting: higher to lower
		// lower_data_type var_name = (lower_data_type) higher_data_type_var_name
		short shHigh = 128;
		byte byL = (byte) shHigh;
		System.out.println("short to byte "+byL);
		
		float fH = 123.44f;
		int iLow = (int) fH;
		System.out.println("float to int "+iLow);
		
		int iH = 123;
//		boolean bL = (boolean) iH; //boolean does not support casting
		char chLow = (char) iH;
		System.out.println("int to char "+chLow);
		
		
		// type conversion
		// primitive to reference(string)
		// int to string
		int is = 12345;
		String i2s = Integer.toString(is);
		System.out.println(i2s+100);
		
		// float to string
		float fs = 123.456f;
		String f2s = Float.toString(fs);
		System.out.println(f2s+100);
		
		// boolean to string
		boolean bs = true;
		String b2s = Boolean.toString(bs);
		System.out.println(b2s+100);
		
		// reference to primitive
		// string to int
		String si = "654321";
		int s2i = Integer.parseInt(si);
		float s2f = Float.parseFloat(si);
		System.out.println(s2i+10);
		System.out.println(s2f);
		
		
		// string to double
		String sd = "2345.9887";
		double s2d = Double.parseDouble(sd);
		System.out.println(s2d+10);
		int d2i = (int) s2d;
		System.out.println(d2i);
		
		
		//string to boolean
		String sb = "true"; //other than string "true" any string is false
		boolean s2b = Boolean.parseBoolean(sb);
		System.out.println(s2b);
		
		
		
	}

}
