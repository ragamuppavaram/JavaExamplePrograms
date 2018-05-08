package java_homework;

public class ArrayRuntimeArgsEx {
	public static void main(String[] a) {
		int n = a.length;
		System.out.println("No of args: " + n);
		System.out.println("The args are");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}
}
