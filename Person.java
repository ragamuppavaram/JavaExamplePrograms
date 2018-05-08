package java_homework;

class SecondType {
	private String name = "raga";
	private int age = 25;

	void talk() {
		System.out.println("Hello I am---> " + name);
		System.out.println("Hello My Age is ----> " + age);

	}
}

public class Person {
	public static void main(String[] args) {
		SecondType st = new SecondType();
		st.talk();
		SecondType st1 = new SecondType();

	}
}
