package java_homework;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		SortedMap map = new TreeMap();

		map.put("2", "Two");
		map.put("1", "One");
		map.put("5", "Five");
		map.put("4", "Four");
		map.put("3", "Three");

		System.out.println("The lowest Key value is: " + map.firstKey());

		System.out.println("The Highest Key value is: " + map.lastKey());
 
		System.out.println("All values: " + map);
		System.out.println("The head map is: " + map.headMap("4"));
		System.out.println("The tail map is: " + map.tailMap("4"));
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object key = it.next();
			System.out.println("Key: " + key + " value: " + map.get(key));
		}
	}
}
