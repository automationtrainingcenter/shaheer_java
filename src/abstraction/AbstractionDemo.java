package abstraction;

import java.util.Scanner;

import abstraction.Outer.Inner;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details of methods
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * A class can implement multiple interfaces and can only extends one normal class or one abstract class
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name
 * 
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * Type of interfaces
 * Marker or tagged interface
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */

public class AbstractionDemo {
	public static void main(String[] args) {
		
		//abstract class
		AbstractClassDemo obj = new AbstractClassImpl();
		obj.methodOne();
		obj.methodTwo();
		
		// interface
		MyInterface iObj = new MyInterfaceImpl();
		iObj.methodOne();
		iObj.methodTwo();
		iObj.methodThree();
		
		// single class implementing multiple interfaces
		InterfaceOne i1Obj = new ClassOne();
		i1Obj.methodOne();
		
//		InterfaceTwo i2Obj = new ClassOne();
//		InterfaceTwo i2Obj = (ClassOne)i1Obj;
		InterfaceTwo i2Obj = (InterfaceTwo)i1Obj;
		i2Obj.methodTwo();
		
		// single class implementing outer and inner interfaces
		Outer outObj = new OuterInnerImpl();
		outObj.methodOne();
		Inner inObj = outObj.method();
//		Outer.Inner inObj = (Outer.Inner) outObj;
		inObj.methodTwo();
		
		outObj.method().methodTwo();
		
//		Scanner sc = new Scanner(System.in);
//		int length = sc.next().toLowerCase().concat("some string").toCharArray().length;
//		System.out.println(length);
	}
}
