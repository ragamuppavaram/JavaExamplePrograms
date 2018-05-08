package java_homework;

class Static {
	static int a = 10;

	static void display() {
		System.out.println(a);
	}
}

public class StaticMethodDemo {
	public static void main(String[] args) {
		Static.display();
	}
}
