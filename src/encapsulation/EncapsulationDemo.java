package encapsulation;
/*
 * Encapsulation means hiding properties of a class
 * or binding properties and operations we can perform on properties together
 * we can hide the properties by making them as private
 * we can create getter and setter methods respectively for properties
 */
public class EncapsulationDemo {
	
	
	public static void main(String[] args) {
		// create an object account class
		Account obj = new Account(101223311, "surya", "lingampalli", "9871122330", 10000.00);
		System.out.println("Account created successfully");
		System.out.println(obj.getAddress());
		obj.setAddress("miyapur");
		System.out.println(obj.getAddress());
	}
}
