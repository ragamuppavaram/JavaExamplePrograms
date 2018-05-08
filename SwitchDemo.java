package java_homework;

public class SwitchDemo {
	public static void main(String[] args) {
		char color = 'g';
		switch (color) {
		case 'r':
			System.out.println("Red");
			break;
		case 'g':
			System.out.println("Green");
			break;
		case 'b':
			System.out.println("Blue");
			break;
		case 'w':
			System.out.println("White");
			break;
		case 'p':
			System.out.println("Pink");
			break;
		default:
			System.out.println("No condition");
		}
	}
}
