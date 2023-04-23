/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList */

package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// Add 10 string elements to ArrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Elderberry");
		list.add("Fig");
		list.add("Grape");
		list.add("Honeydew");
		list.add("Ice cream bean");
		list.add("Jackfruit");

		// Add an element to the ArrayList
		list.add("Kiwi");

		// Iterate through the ArrayList by using Iterator object
		System.out.println("Iterating through the ArrayList using an Iterator:");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// Add an element at a specific index
		list.add(3, "Durian");

		// Remove an element from the ArrayList, Remove at an index
		list.remove("Grape");
		list.remove(7);

		// Update the element at a specific index
		list.set(5, "Fig (Updated)");

		// Check the element is present at a particular index
		boolean isPresent = list.contains("Banana");
		System.out.println("Is 'Banana' present in the ArrayList? " + isPresent);

		// Get an element at a particular index
		String element = list.get(2);
		System.out.println("Element at index 2: " + element);

		// Find out the size of the ArrayList
		int size = list.size();
		System.out.println("Size of the ArrayList: " + size);

		// Check the given element is present in the ArrayList
		boolean isPresent2 = list.contains("Lemon");
		System.out.println("Is 'Lemon' present in the ArrayList? " + isPresent2);

		// Remove all elements of the ArrayList
		list.clear();
		System.out.println("ArrayList after removing all elements: " + list);
	}
}
