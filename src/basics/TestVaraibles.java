package basics;

public class TestVaraibles {

	public static void main(String[] args) {
		//accessing iVar of VariablesDemo class inside this class main method
		VaraiblesDemo obj = new VaraiblesDemo();
		System.out.println("instance variable of VariablesDemo class = "+obj.iVar);
		
		//accessing sVar of VariablesDemo class inside this class main method
		System.out.println("static variable of VariablesDemo class = "+VaraiblesDemo.sVar);
		
		//calling instance method of VariablesDemo class inside this class main method
		obj.insMethod();
		int x = 45;
//		++x;
		
		System.out.println(++x);
		System.out.println(x);
	}
	
}
