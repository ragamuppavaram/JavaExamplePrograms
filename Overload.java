package java_homework;

class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}

	// Overloading test method with one int parameter
	void test(int a) {
		System.out.println("a : " + a);
	}

	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	double test(double a) {
		System.out.println("double a:" + a);
		return a * a;
	}
}

public class Overload {
	public static void main(String[] args) {
		OverloadDemo overloadDemo = new OverloadDemo();
		double result;

		overloadDemo.test();
		overloadDemo.test(10);
		overloadDemo.test(10, 20);
		result = overloadDemo.test(123.25);
		System.out.println("Result of ob.test(123.25): " + result);

	}
}