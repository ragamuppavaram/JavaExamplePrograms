package java_homework;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value");
		String s = sc.nextLine();
		System.out.println("The value entered from keyboard is: " + s);

	}
}
