package OopsPillars.Inheritance;

public class CheckMutliLevelInheritance extends CheckSingleInheritance {

	public void printStatement(String printer) {
		System.out.println("Statement:  " + printer);
	}

	public static void main(String[] args) {
		CheckMutliLevelInheritance multi = new CheckMutliLevelInheritance();
		multi.tester();
		System.out.println("Program Result of Single Inheritance : " + multi.program(4, 6));
		multi.printStatement("MultiLevel Inheritance");

	}

}
