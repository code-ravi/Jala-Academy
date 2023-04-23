/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map */

package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Create a HashMap with at least 10 key value pairs of Student ID and Name
		Map<Integer, String> map = new HashMap<>();
		map.put(1001, "Ravi");
		map.put(1002, "Vikas");
		map.put(1003, "Saurabh");
		map.put(1004, "Durlav");
		map.put(1005, "Anil");
		map.put(1006, "Tushar");
		map.put(1007, "Rajesh");
		map.put(1008, "Sudhanshu");
		map.put(1009, "Suraj");
		map.put(1010, "Swapnil");

		// Insert a Key value mapping into the map
		map.put(1011, "Amol");

		// Fetch the value of a Key
		String name = map.get(1005);
		System.out.println("Name for ID 1005: " + name);

		// Create a clone/copy of HashMap
		Map<Integer, String> mapCopy = new HashMap<>(map);

		// Check if the given Key is in the Map
		boolean containsKey = map.containsKey(1009);
		System.out.println("Does map contain key 1009? " + containsKey);

		// Check if the value is in the Map
		boolean containsValue = map.containsValue("Vikas");
		System.out.println("Does map contain value 'Vikas'? " + containsValue);

		// Check if the map is empty
		boolean isEmpty = map.isEmpty();
		System.out.println("Is map empty? " + isEmpty);

		// Print the size of the Map to the console
		int size = map.size();
		System.out.println("Size of map: " + size);

		// Print all the Keys of the map to the console
		System.out.println("Keys in map: ");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}

		// Print all the Values of the map to the console
		System.out.println("Values in map: ");
		for (String value : map.values()) {
			System.out.println(value);
		}

		// Remove a specific Key-value pair
		map.remove(1006);

		// Copy all the elements of the Map to another Map
		Map<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);
		System.out.println("Copied map: " + map2);
	}
}
