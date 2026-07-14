package Pillars;

public class CheckMutliLevelInheritance extends CheckSingleInheritance{

	CheckMutliLevelInheritance(String input) {
		super(input);
	}

	public void printStatement(String printer)
	{
		System.out.println("Statement:  "+printer);
	}
	
	public static void main(String[] args) {
		CheckMutliLevelInheritance multi = new CheckMutliLevelInheritance("SingleInheritance");
		multi.printStatement("MultiLevel Inheritance");
		System.out.println("Program Result : "+multi.program(4,6));
	}
	
}


