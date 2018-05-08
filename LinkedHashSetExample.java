package java_homework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(new Integer("1"));
		lh.add(new Integer("2"));
		lh.add(new Integer("3"));
		System.out.println("LinkedHashSet contains..." + lh);
	}
}
