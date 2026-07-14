package OopsPillars;

abstract class Cartoon {
	abstract void tomAndJerry();
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
