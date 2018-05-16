package java_homework;

public class Array2DDemo {
	public static void main(String[] args) {
		int x[][] = { { 23, 56, 47 }, { 26, 24, 86 }, { 12, 56, 64 } };
		System.out.println("In Matrix Form");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(x[i][j] + "\t");
			}
			System.out. println();
		}

	}
}
