package Pillars;

public class CheckPolymorphism extends CheckClass{

	CheckPolymorphism(String input) {
		super(input);
	}

	public void test1(int addInput) {
		System.out.println("test1:" + addInput);
	}

	public void test1(int addInput1, int addInput2) {
		System.out.println("test2:" + addInput1 + "," + addInput2);
	}

	@Override
	public String displayMessage() {
		return message;
	}
	
	public static void main(String[] args) {
		CheckPolymorphism meth = new CheckPolymorphism("Polymorphism");
		meth.test1(1);                               //Method Overloading
		meth.test1(22, 33);                          //Method Overloading
		System.out.println("Method : "+meth.displayMessage());  
	}
	
	
}
