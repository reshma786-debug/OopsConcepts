package OopsPillars.Abstraction;

interface child2_Interface {

	void sound();

	default String property(String name, String name2) {
		return name = name + name2;
	}

	static String test(String print) {
		return print;
	}
}