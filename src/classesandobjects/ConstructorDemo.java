package classesandobjects;

import java.io.Console;
import java.util.Scanner;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */
public class ConstructorDemo {
	
	// Employee 
	int id;
	String name;
	String designation;
	double salary;
	long phoneNum;
	String address;
	String panNum;
	
	public ConstructorDemo() {
		this.id = 100;
		this.name = "sunshine";
		this.designation = "tester";
		this.salary = 65000.00;
		this.phoneNum = 9876443312l;
		this.address = "miyapur";
		this.panNum = "avaqw1234h";
	}
	
	//parameterized constructor
	public ConstructorDemo(int id, String name, String designation, long phoneNum, double salary, String address, String panNum) {
		this(id, name, designation, phoneNum, salary);
		this.address = address;
		this.panNum = panNum;
	}
	
	public ConstructorDemo(int id, String name, String designation, long phoneNum, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.phoneNum = phoneNum;
	}
	
	
	public void display() {
		System.out.println("id = "+this.id+"\nname = "+this.name+"\ndesignation = "+this.designation+"\nsalary = "+this.salary+
				"\nphone num = "+this.phoneNum+"\naddress = "+this.address+"\npan num = "+this.panNum);
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		obj.display();
		ConstructorDemo obj1 = new ConstructorDemo();		
		obj1.id = 101;
		obj1.name = "surya";
		obj1.designation = "developer";
		obj1.salary = 86000.00;
		obj1.phoneNum = 8971122334l;
		obj1.address = "lingampalli";
		obj1.panNum = "qwsa1234j";
		obj1.display();
		ConstructorDemo obj2 = new ConstructorDemo(102, "ravi", "admin", 8765432199l, 56000.00,  "chandanagar", "uhngf1298j");
		obj2.display();
		ConstructorDemo obj3 = new ConstructorDemo(103, "rakesh", "admin", 8765432329l, 56000.00);
		obj3.display();
		
		obj3.salary = 25000.00;
		obj3.display();

	}
	

}
