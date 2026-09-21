package OopsPillars.Oops;

//Compile-time Polymorphism): This is achieved through method overloading
//Run-time Polymorphism): This is achieved through method overriding

public class CheckPolymorphism extends CheckClass {

	CheckPolymorphism(String input) {
		super(input);
	}

	// Method Overloading - different underlying forms (data types)
	public void test1(int addInput) {
		System.out.println("test1:" + addInput);
	}
	public void test1(int addInput1, int addInput2) {
		System.out.println("test2:" + addInput1 + "," + addInput2);
	}

   //Method Overriding - subclass provides a specific implementation of a method that is already defined in its superclass
	@Override
	public String displayMessage() {
		return message;
	}

	public static void main(String[] args) {
		CheckPolymorphism meth = new CheckPolymorphism("Polymorphism");
		meth.test1(1); // Method Overloading
		meth.test1(22, 33); // Method Overloading
		System.out.println("Method : " + meth.displayMessage()); // Method Overriding
	}
}
