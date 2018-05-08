package java_homework;

class Test1 {
	private String a;
	private int b;
	private int c;

	Test1() {
		a = "xyz";
		b = 30;
		c = 45;
	}

	Test1(String a, int b) {
		this.a = a;
		this.b = b;
	}

	Test1(String a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void display() {
		System.out.println("Hello name is: " + a);
		System.out.println("Hello age is: " + b);
		System.out.println("Hello age is: " + c);
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.display();
		Test1 t1 = new Test1("raga", 22);
		t1.display();
		Test1 t2 = new Test1("raga", 22, 45);
		t2.display();

	}
}
