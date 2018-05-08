package java_homework;

public class PrePostIncrement {
	public static void main(String[] args) {
		int x = 3;
		System.out.println(++x * x++ * x++);
		System.out.println(++x * x++ * ++x);

	}
}
