package oopsConcept;

public abstract class AbstractCars {
	
	int speed;
	
	public AbstractCars(int StartSpeed) {
		speed = StartSpeed;
	}
	
	public void IncreaseSpeed() {
		speed++;
		System.out.println("Increase speed of Car Class");
	}

}
