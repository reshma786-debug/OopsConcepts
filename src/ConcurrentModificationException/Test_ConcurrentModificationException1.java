package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test_ConcurrentModificationException1 {

	public static void main(String[] args) {
        ArrayList<String> tropicalFruits = new ArrayList<>(Arrays.asList("Pineapple", "Papaya"));
		Iterator <String> textFruits = tropicalFruits.iterator();
		tropicalFruits.add("Mango"); // ConcurrentModificationException
		while(textFruits.hasNext())
		{
			String name = textFruits.next();
			System.out.print(name);
			
		}
	}

}
