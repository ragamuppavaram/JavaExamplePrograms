package java_homework;

class OverLoadEx {
	void add(int a, int b) {
		System.out.println("Sum of two numbers= " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Sum of three numbers= " + (a + b + c));
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {
		OverLoadEx ol = new OverLoadEx();
		ol.add(10, 20);
		ol.add(10, 20, 30);
	}
}
