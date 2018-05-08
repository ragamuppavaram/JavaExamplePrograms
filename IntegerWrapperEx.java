package java_homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerWrapperEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number");
		String str = br.readLine();
		int n = Integer.parseInt(str);
		System.out.println("In decimal---->" + n);
		str = Integer.toBinaryString(n);
		System.out.println("In binary---->" + str);
		str = Integer.toHexString(n);
		System.out.println("In Hexdecimal---->" + str);
		str = Integer.toOctalString(n);
		System.out.println("In Octal---->" + str);

	}
}
