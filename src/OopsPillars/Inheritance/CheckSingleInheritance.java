package OopsPillars.Inheritance;

public class CheckSingleInheritance extends CheckInheritanceClass {

	public int program(int i, int j) {
		int sum = i * j;
		return sum;
	}

	public static void main(String[] args) {
		CheckSingleInheritance single = new CheckSingleInheritance();
		single.tester();
		System.out.println("Program Result : " + single.program(4, 6));
	}

}
