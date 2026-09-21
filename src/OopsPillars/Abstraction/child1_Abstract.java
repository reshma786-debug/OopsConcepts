package OopsPillars.Abstraction;

class child1_Abstract extends TestAbstract {
	child1_Abstract(String value) {
		super(value);
	}

	public void sound() {
		System.out.println("child1");
	}

	public String property(String name1, String name2) {
		String name = name1 + name2;
		return name;
	}

}