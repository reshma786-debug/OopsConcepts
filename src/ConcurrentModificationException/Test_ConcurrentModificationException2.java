package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.List;

public class Test_ConcurrentModificationException2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("cls");
		for (String name : names) {
		    if (name.equals("Bob")) {
		        names.remove(name);  
		    }
		}
		System.out.println(names);
	}

}
