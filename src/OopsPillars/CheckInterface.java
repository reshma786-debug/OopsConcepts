package OopsPillars;

//abstraction is achieved using abstract classes and interfaces
interface Carrier {
	void represent(String goal); //hiding implementation details and exposing only the functionality
}

class CheckInterface implements Carrier {
	public void represent(String goal) {
		System.out.println("Goal: " + goal);
	}
	
	public static void main(String[] args) {
		Carrier car = new CheckInterface();
		car.represent("Software Engineer");
	}
}
