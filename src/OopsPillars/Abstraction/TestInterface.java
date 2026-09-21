package OopsPillars.Abstraction;

public class TestInterface implements child1_Interface, child2_Interface{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String property(String name) {
		// TODO Auto-generated method stub
		return child1_Interface.super.property(name);
	}

}
