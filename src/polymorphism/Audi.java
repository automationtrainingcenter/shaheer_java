package polymorphism;

public class Audi extends Car{

	@Override
	public void start() {
		System.out.println("Audi car started using electronic key");
	}

	@Override
	public void accelarate() {
		System.out.println("Audi car speed increased by 20kmph");
	}
	
	

}
