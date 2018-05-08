package java_homework;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
	public static void main(String[] args) {
		System.out.println("Navigable Set Example!\n");
		NavigableSet n = new TreeSet();
		n.add(10);
		n.add(20);
		n.add(50);
		n.add(30);
		n.add(100);
		n.add(80);

		Iterator it = n.iterator();

		System.out.println("Ascending order navigable Set: ");
		while (it.hasNext()) {
			System.out.println(it.next() + " ");

		}
		System.out.println();

		System.out.println("Descending order navigable set: " + n.descendingSet());
	}
}
