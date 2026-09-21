package OopsPillars.Oops;

public class CheckEncapsulation {

	// Wraps data and methods together, restricting direct access to fields by
	// making them private
	private String name;

	// and using getters/setters.
	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public static void main(String[] args) {
		CheckEncapsulation encap = new CheckEncapsulation();
		encap.setName("There");
		System.out.println("Encapsulation name: " + encap.getName());
	}

}
