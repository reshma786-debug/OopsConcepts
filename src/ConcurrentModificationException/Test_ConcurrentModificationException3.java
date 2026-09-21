package ConcurrentModificationException;

import java.util.*;

public class Test_ConcurrentModificationException3 {
	public static void main(String[] args) {
		//try {
			List<String> list = new ArrayList<>(List.of("One", "Two", "Three", "Four"));
			for (String item : list) {
				if (item.equals("Two")) {
					list.remove(item); // Causes ConcurrentModificationException
				}
			}
			System.out.println(list);
		//} catch (Exception ConcurrentModificationException) {
			// TODO: handle exception
		//}
	}
}