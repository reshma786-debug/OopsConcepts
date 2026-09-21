package OopsPillars.Oops;

//abstraction is achieved using abstract classes and interfaces

abstract class Cartoon {

	abstract void tomAndJerry(); // both abstract methods (without a body) and concrete methods (with
								 // implementation)

	public void test() {
		System.out.println("Concerte Methods");
	}
}

public class CheckAbstraction extends Cartoon {
	@Override
	void tomAndJerry() {
		System.out.print("tomAndJerry Show Time : 5PM");
	}

	public static void main(String[] args) {
		CheckAbstraction abs = new CheckAbstraction();
		abs.tomAndJerry();
	}
}
