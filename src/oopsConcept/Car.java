/*
 * Class Example 
 */
package oopsConcept;

public class Car {
	private String make;
	private String color;
	private String Model;
	private int year;

	
	public void IncreaseSpeed() {
		System.out.println("this increase the speed of the car.");
	}
	
	
	public String getmake() {
		return this.make = make;
	}
	public void setmake(String make) {
		this.make=make;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		
		Model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		if(year > 1900) {
			
			this.year = year;
		} else  {
			System.out.println("This year is not valid .");
		}
		
	}
}
