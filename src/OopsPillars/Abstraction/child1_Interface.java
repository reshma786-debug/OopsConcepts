package OopsPillars.Abstraction;

interface child1_Interface {

	abstract void sound();

	default String property(String name) {
		return name;
	}
}