package java_homework;

public class RreverseInt {
	public static void main(String args[]) {
		int r = 0, rev = 0;
		int n = 67345;
		while (n != 0) {
			r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;
		}
		System.out.println("The reverse of a number is: " + rev);
	}
}
