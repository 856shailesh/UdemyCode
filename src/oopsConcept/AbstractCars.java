package oopsConcept;

public abstract class AbstractCars {
	
	int speedLimit=100;
	
	private int privateSpeed;
	public int publicSpeed;
	protected int protectedSpeed;
	
	public AbstractCars() {
		this(0);
	}
	
	public AbstractCars(int StartSpeed) {
		this.privateSpeed=StartSpeed;
	}
	
	public void SetPrivateSpeed(int pSpeed) {
		this.privateSpeed=pSpeed;
	}
	
	public abstract void engineStart(String KeyType,int Cylinders);
	

}
