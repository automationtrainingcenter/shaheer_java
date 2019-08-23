package polymorphism;

import java.util.Scanner;

public class TestCar {
	public static void main(String[] args) {
		Car carObj;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your car");
		String car = sc.next();
		if(car.equals("honda")) {
			carObj = new Honda();
		}else if(car.equals("audi")) {
			carObj = new Audi();
		}else {
			carObj = new Car();
		}
		carObj.start();
		carObj.accelarate();
	}

}
