package java_homework;

public class BreakLoopDemo {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i == 10)
				break;
			if (i == 10)
				continue;
			if ((i % 2 == 0))
				continue;
			System.out.println("i: " + i);
		}
		System.out.println("Loop Complete. ");
	}
}
