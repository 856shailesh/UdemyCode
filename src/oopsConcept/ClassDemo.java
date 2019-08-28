package oopsConcept;

public class ClassDemo {
	
	public static void main(String[] args) {
		
		Car bmw = new Car();
		bmw.IncreaseSpeed();
		bmw.setmake("BMW");
		System.out.println(bmw.getModel());
		
		Car tata = new Car();
		tata.setmake("Tata");
		System.out.println(tata.getmake());
		
		tata.setColor("Orange");
		System.out.println(tata.getColor());
		
		tata.setYear(1867);
		System.out.println("Tata set year is : "+ tata.getYear());
	}

}
