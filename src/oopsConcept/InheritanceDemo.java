package oopsConcept;

import accessModifiers.BMW;
import accessModifiers.CarClass;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 0;
		
		CarClass c1= new CarClass(speed);
		c1.IncreaseSpeed();
		
		BMW c2 = new BMW(speed);
		c2.IncreaseSpeed();
		
		c2.SpecificFunctionality();
	}

}
