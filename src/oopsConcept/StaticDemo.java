package oopsConcept;

public class StaticDemo {

	public static void main(String[] args) {
		StaticExample s1 = new StaticExample("tata");
		System.out.println("The make of the car is "+ s1.getmake());
		System.out.println("Instance number is : " + StaticExample.getInstanceNum()); 
		
		StaticExample s2 = new StaticExample("maruti");
		System.out.println("The make of the car is "+ s2.getmake());
		System.out.println("Instance number is : " + StaticExample.getInstanceNum());
		
		System.out.println(StaticExample.getInstanceNum());

	}

}
