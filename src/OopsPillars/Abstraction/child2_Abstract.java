package OopsPillars.Abstraction;

class child2_Abstract extends TestAbstract {


	child2_Abstract(String value) {
		super(value);
	}



	public void sound() {
		System.out.println("child2");
	}

	public String property(String name1, String name2, String name3) {
		String name = name1 + name2 + name3;
		return name;
	}

}
