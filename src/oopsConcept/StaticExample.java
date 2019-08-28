package oopsConcept;

public class StaticExample {
	
	private static int WheelsCount = 4;
	private String make;
	private static int instanceNum = 0;
	
	public StaticExample(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getmake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}

}
