package java_homework;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "Gyan");
		lhm.put(6, "Ankit");
		lhm.put(5, "Arun");
		lhm.put(4, "Ram");
		lhm.put(3, "Anand");
		System.out.println("The Entries of LinkedHashMap are: " + lhm);

	}
}
