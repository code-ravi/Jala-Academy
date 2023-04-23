/*3. Create a HashSet with at least 10 elements of type String. Write program covering all the operations of HashSet */
package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// Create a HashSet with at least 10 elements of type String
		Set<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("date");
		set.add("elderberry");
		set.add("fig");
		set.add("grape");
		set.add("honeydew");
		set.add("kiwi");
		set.add("lemon");

		// Print the HashSet
		System.out.println("HashSet: " + set);

		// Add an element to the HashSet
		set.add("mango");

		// Iterate through the HashSet by using Iterator object
		System.out.println("Elements in HashSet: ");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// Remove an element from the HashSet
		set.remove("banana");

		// Check if an element is present in the HashSet
		boolean containsElement = set.contains("grape");
		System.out.println("Does HashSet contain 'grape'? " + containsElement);

		// Check the size of the HashSet
		int size = set.size();
		System.out.println("Size of HashSet: " + size);

		// Remove all the elements from the HashSet
		set.clear();

		// Check if the HashSet is empty
		boolean isEmpty = set.isEmpty();
		System.out.println("Is HashSet empty? " + isEmpty);
	}
}
