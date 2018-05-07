package java_homework;

class Test {
	int a;

	Test(int i) {
		a = i;
	}

	Test incrByTen() {
		Test temp = new Test(a + 10);
		return temp;
	}
}

public class RetOb {
	public static void main(String[] args) {
		Test test = new Test(2);
		Test test1;

		test1 = test.incrByTen();
		System.out.println("test.a: " + test.a);
		System.out.println("test1.a: " + test1.a);

		test1 = test1.incrByTen();
		System.out.println("test1.a after second increase: " + test1.a);

	}
}