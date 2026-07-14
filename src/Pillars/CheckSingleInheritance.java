package Pillars;

public class CheckSingleInheritance extends CheckClass{

	CheckSingleInheritance(String input) {
		super(input);
	}

	public int program(int i,int j)
	{
		int sum= i*j;
		return sum;
	}
	
	public static void main(String[] args) {
		CheckSingleInheritance single = new CheckSingleInheritance("SingleInheritance");
		System.out.println("Program Result : "+single.program(4,6));
	}
	
}


