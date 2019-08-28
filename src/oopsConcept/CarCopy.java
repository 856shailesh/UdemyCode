/*
 * Class Example 
 */
package oopsConcept;

public class CarCopy {
	private String make;
	int gear;
	int speed; 

	public CarCopy() {
		this(2,40);
		this.gear=0;
		this.speed=0;
		System.out.println("This is a default constructor ");
	}
	
	public CarCopy(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
		System.out.println("This is an argumented constructor");
	}
	

	
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}