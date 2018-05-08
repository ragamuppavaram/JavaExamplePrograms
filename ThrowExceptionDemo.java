package java_homework;

public class ThrowExceptionDemo {
	static void demo() {
		try {
			throw new NullPointerException("MyData");
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
	}

	public static void main(String[] args) {
		ThrowExceptionDemo.demo();
	}
}
