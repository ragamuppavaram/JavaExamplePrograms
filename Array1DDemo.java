package java_homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1DDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many Subjects");

		int n = Integer.parseInt(br.readLine());
		int marks[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks");
			marks[i] = Integer.parseInt(br.readLine());
		}
		int total = 0;
		System.out.println("The marks are");

		for (int i = 0; i < n; i++) {
			System.out.println(marks[i]);
			total = total + marks[i];
		}
		System.out.println("Total marks= " + total);
		float percent = (float) total / n;
		System.out.println("Percent " + percent);
		System.out.println("The length of array= " + marks.length);
	}
}
