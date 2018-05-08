package java_homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a value");

		String ch = br.readLine();
		float ch1 = Float.parseFloat(ch);
		double ch11 = Double.parseDouble(ch);
		System.out.println("You have entered---> " + ch);
	}
}
