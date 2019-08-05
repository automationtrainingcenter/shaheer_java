package classesandobjects;
/*
 * Class is a blueprint or template to create the objects
 * Class is a logical entity which does not exist physically.
 * Class is a collection of objects or Class is used to 
 * create objects.
 * 
 * to create a class in Java we have to use class keyword
 * 
 * syntax: 
 * class <ClassName>{ ..... }
 * 
 * In general class contains properties and methods
 * properties collection of variables and data types
 * in a class we can have either static or instance properties
 * similarly a class can have either static or instance methods.
 * 
 * 
 * Object is an instance of the class.
 * Object is a real time or run time entity which exist physically.
 * Object are used to store and retrieve data from instance properties of a class
 * Objects will perform actions using methods defined in class
 * 
 * to create an object we have to use new keyword
 * syntax:
 * 
 * ClassName obj_name = new Class_name();
 * 
 * Accessing instance properties of the class using object
 * obj_name.property_name;
 * 
 * Accessing instance method of the class using object
 * obj_name.method_name();
 */

public class ClassDemo {
	
	// properties
	int i;
	String name;

	//instance method
	public void display() {
		System.out.println("inside class display method");
		System.out.println("i = "+i+"\nname = "+name);
	}
	
	//static method
	public static void main(String[] args) {
		//create an object of the class
		ClassDemo obj = new ClassDemo();
		System.out.println(obj.i);
		System.out.println(obj.name);
		obj.display(); 
	}
	
	
}
