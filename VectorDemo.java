package java_homework;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		Vector<Integer> vec = new Vector<Integer>();

		vec.add(4);
		vec.add(3);
		vec.add(2);
		vec.add(1);

		System.out.println("Initial elements in vector are: ");

		for (Integer number : vec) {
			System.out.println("Number= " + number);
		}

		vec.addElement(12);

		System.out.println("Elements after addition: ");
		for (Integer ele : vec) {
			System.out.println("Number: " + ele);
		}

	}
}
