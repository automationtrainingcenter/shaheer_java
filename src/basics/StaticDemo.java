package basics;

public class StaticDemo {
	
	int i = 0;
	static int j = 0;
	
	public void increment() {
		i = i+1;
		j = j+1;
		System.out.println("i = "+i+"\tj = "+j);
	}
	
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.increment();// i =    j = 
		
		StaticDemo obj2 = new StaticDemo();
		obj2.increment();// i =    j = 
		obj2.increment();
		
		StaticDemo obj3 = new StaticDemo();
		obj3.increment();// i =    j = 
	}

}
