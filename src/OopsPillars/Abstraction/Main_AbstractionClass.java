package OopsPillars.Abstraction;

class Main_AbstractionClass {

	public static void main(String[] args) {
		
		TestAbstract ref = new child1_Abstract("ant");
		ref.sound();
		System.out.println(ref.getValue());
		System.out.println();
		
		TestAbstract ref1 = new child2_Abstract(null);
		ref1.sound();
		System.out.println(ref1.getValue());
		System.out.println(ref1.property("black"));
		System.out.println(ref1.getValue());
		System.out.println();
		
		child1_Abstract c1 = new child1_Abstract("child1");
		System.out.println(c1.property("kid1 ", "kid1"));
		System.out.println();
		
		child2_Abstract c2 = new child2_Abstract(null);
		System.out.println(c2.property("kid2 ", "kid2 ","kid2"));


	}

}
