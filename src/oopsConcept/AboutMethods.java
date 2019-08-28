package oopsConcept;

public class AboutMethods {
	
	public static void main(String[] args) {
		
		
		String Grade = findgrades(75);
		DisplayGrades("Shailesh",Grade);
	}
	
	public static String findgrades(int grades){
		String GradeValue = null;
		if(grades>90) {
			GradeValue = "A";
		} else if (grades>60 && grades<90) {
			GradeValue = "B";
		} else if (grades<60) {
			GradeValue = "C";
		}
		return GradeValue;
	}
	
	public static void DisplayGrades(String Studentname, String Grade) {
		System.out.println("The grade of " + Studentname + " is :" + Grade);
	}

}
