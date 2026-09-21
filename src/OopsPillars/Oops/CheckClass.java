package OopsPillars.Oops;

public class CheckClass {

	//Define variables
	static int i;
	String message = "";

	//Customise customers
    CheckClass(String input) {
		this.message = input;
	}

    //Define Method
	public String displayMessage() {
		return message;
	}
	
	//Define Enum
	enum Level {
		LOW, MEDIUM, HIGH 
		//Enums are defined using the enum keyword. Each constant in an enum is implicitly public, static, and final.
	}

	//Define static Blocks
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
