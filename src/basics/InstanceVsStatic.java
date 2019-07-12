package basics;

public class InstanceVsStatic {
	
	
	//Student class
	int id;
	String name;
	String course;
	double balance;
	static String insituteName;
	
	
	//print data 
	public void printDetails() {
		System.out.println(id+"\t"+name+"\t"+course+"\t"+balance+"\t"+insituteName);
	}
	
	public static void main(String[] args) {
		InstanceVsStatic.insituteName = "SSTS";
		
		
		//create an object
		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.id = 101;
		obj1.name = "surya";
		obj1.course = "Java";
		obj1.balance = 6000.00;
		
		obj1.printDetails();
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.id = 102;
		obj2.name = "shaheer";
		obj2.course = "Testin";
		obj2.balance = 8000.00;
		
		obj2.printDetails();
		
		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.id = 103;
		obj3.name = "rajesh";
		obj3.course = "Python";
		obj3.balance = 6000.00;
		
		obj3.printDetails();
		
		obj1.course = "Selenium";
		obj2.balance = 4000.00;
		obj3.name = "satish";
		
		InstanceVsStatic.insituteName = "Sunshine";
		
		obj1.printDetails();
		obj2.printDetails();
		obj3.printDetails();
	}

}
