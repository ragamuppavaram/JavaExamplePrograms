package java_homework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();

		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahuls");
		System.out.println("head: " + queue.element());
		System.out.println("head: " + queue.peek());

		System.out.println("Iterating the queue elements");

		Iterator it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements");

		Iterator it1 = queue.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}
}
