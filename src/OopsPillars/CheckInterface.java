package OopsPillars;

interface Carrier {
	void represent(String goal);
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
