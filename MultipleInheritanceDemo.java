package java_homework;

interface Father {
	int PROP1 = 50000;
	float HT1 = 6.2F;
}

interface Mother {
	int PROP2 = 60000;
	float HT2 = 6.0F;
}

class Child implements Father, Mother {
	void property() {
		System.out.println("Child property= " + (PROP1 + PROP2));
	}

	void height() {
		System.out.println("Child height= " + (HT1 + HT2) / 2);
	}
}

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.property();
		c.height();
	}
}
