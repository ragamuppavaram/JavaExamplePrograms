package java_homework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet ss = new TreeSet();

		ss.add("a");
		ss.add("e");
		ss.add("g");
		ss.add("b");
		ss.add("c");
		ss.add("a");
		Iterator it = ss.iterator();

		while (it.hasNext()) {
			String value = (String) it.next();
			System.out.println("Value: " + value);
		}
	}
}
