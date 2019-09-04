/*
 * Author : Shailesh Kumar
 */
package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		IncreaseHeight("Shai");
		IncreaseHeight(2);

	}
	
	public static void IncreaseHeight(String Value) {
		System.out.println("This is to increase height");
	}
	
	public static void IncreaseHeight(int Value) {
		System.out.println("This is the second overloaded method");
	}

}
