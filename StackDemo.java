package java_homework;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("Java");
		st.push("Source");
		st.push("Code");

		System.out.println("Elements : " + st);
		System.out.println("Removed object is: " + st.pop());

		System.out.println("Elements after remove: " + st);

	}
}
