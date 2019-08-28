package accessModifiers;

public class CarClass {
	int speed;
	
	public CarClass(int StartSpeed) {
		speed = StartSpeed;
	}
	
	public void IncreaseSpeed() {
		speed++;
		System.out.println("Increase speed of Car Class");
	}
	
	protected void DecreaseSpeed() {
		speed --;
		System.out.println("Decrease speed of car Class");
	}
}
