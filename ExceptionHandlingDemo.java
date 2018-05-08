package java_homework;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		System.out.println("Open the files");
		try {
			int n = args.length;
			System.out.println("Number of args: " + n);
			int a = 45 / n;
		} catch (ArithmeticException ae) {
			System.out.println("Unable to process your request");
			System.out.println("Reason for the error is: " + ae.getMessage());
		} finally {
			System.out.println("Close the file");
		}
	}
}
