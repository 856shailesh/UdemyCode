package oopsConcept;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		CarCopy c1 = new CarCopy();
		
		c1.setMake("Tata");
		System.out.println("The make of this car is : " +c1.getMake());
		
		System.out.println(c1.gear);
		System.out.println(c1.speed);
		System.out.println("**********************");
		
		
		CarCopy c2 = new CarCopy(1,10);
		System.out.println(c2.gear);
		System.out.println(c2.speed);
	}

}
