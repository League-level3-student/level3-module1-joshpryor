package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> berginstiensintons = new ArrayList<String>();
		//2. Add five Strings to your list
berginstiensintons.add("berg");
berginstiensintons.add("bergin");
berginstiensintons.add("berginstien");
berginstiensintons.add("berginstiensinton");
berginstiensintons.add("berginstiensintons");
		//3. Print all the Strings using a standard for-loop
for (int j = 0; j < berginstiensintons.size(); j++) {
	
		System.out.println(berginstiensintons.get(j));
}
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < berginstiensintons.size(); i+=2) {
			System.out.println(berginstiensintons.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = berginstiensintons.size(); i >= 0; i--) {
			System.out.println(berginstiensintons.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int j = 0; j < berginstiensintons.size(); j++) {
			if (berginstiensintons.get(j).contains("e")) {
				System.out.println(berginstiensintons.get(j));
			}
		//	System.out.println(berginstiensintons.get(j));
	}
		
	}
}
