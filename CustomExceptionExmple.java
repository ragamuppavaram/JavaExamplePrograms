package java_homework;

class MyException extends Exception {
	private int data;

	MyException(int n) {
		data = n;
		System.out.println("In my exception");
	}

	public String toString() {
		return "Exception raised...due to low bal[" + data + "]";
	}
}

public class CustomExceptionExmple {
	static void check(int no) throws MyException {
		System.out.println("In Check(" + no + ")");
		if (no < 50)
			throw new MyException(no);
		System.out.println("Normal Exit");

	}

	public static void main(String[] args) {
		try {
			check(1000);
			check(350);
		} catch (MyException me) {
			System.out.println(me.getMessage());
		}
	}
}
