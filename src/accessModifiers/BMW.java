package accessModifiers;

public class BMW extends CarClass {
	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void IncreaseSpeed() {
		System.out.println("Increasing speed of BMW");
		
	}
	
	public void SpecificFunctionality() {
		System.out.println("this is specific to BMW");
	}
	

}
