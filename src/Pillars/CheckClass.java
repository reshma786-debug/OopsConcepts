package Pillars;

public class CheckClass {

	static int i;
	String message = "";

    CheckClass(String input) {
		this.message = input;
	}

	public String displayMessage() {
		return message;
	}
	
	enum Level {
		LOW, MEDIUM, HIGH 
		//Enums are defined using the enum keyword. Each constant in an enum is implicitly public, static, and final.
	}

	static {
		i = 10;
	}

	// Run Class
	public static void main(String[] args) {
		CheckClass obj = new CheckClass("Test Java!");             //Constructor - arguments
		System.out.println("Method : "+obj.displayMessage());      //Method
		System.out.println("Static Block : " + i);                 //static Block
		Level lev = Level.MEDIUM;                                  //enum
		System.out.println("Enum : " + lev);
	}
}
