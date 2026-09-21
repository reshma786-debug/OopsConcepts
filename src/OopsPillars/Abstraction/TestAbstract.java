package OopsPillars.Abstraction;

abstract class TestAbstract {

	private String value;

	TestAbstract(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public abstract void sound();

	public String property(String name) {
		return name;
	}
}