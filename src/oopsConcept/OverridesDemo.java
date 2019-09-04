package oopsConcept;

public class OverridesDemo extends ChildOverrides {
	
	public static void main(String[] args) {
		
		OverridesDemo c1 = new OverridesDemo();
		c1.StartEngine(12);
		
		
	}
	

	public void StartEngine(int val) {
		super.StartEngine(11);
		System.out.println("I am from the child class ");
	}
}
