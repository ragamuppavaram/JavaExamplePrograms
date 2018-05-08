package java_homework;

import java.util.Enumeration;
import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(new Integer(6));
		h.add(new Integer(1));
		h.add(new Integer(4));
		System.out.println(h);
		System.out.println();

		System.out.println("Enumerate the HashSet");
		Enumeration e = (Enumeration) h;
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			System.out.println();
		}
		System.out.println("Iterate through the Hashset");

	}
}
