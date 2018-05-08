package java_homework;

class One {
	int x;

	One(int x) {
		this.x = x;
	}

	void show() {
		System.out.println("Super class Method");
	}
}

class Two extends One {
	int x;

	Two(int a, int b) {
		super(a);
		x = b;
	}

	void show() {
		super.show();
		System.out.println(super.x);
		System.out.println("Sub class Method= " + x);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		Two t = new Two(100, 299);
		t.show();
	}
}
