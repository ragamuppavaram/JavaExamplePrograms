package java_homework;

class OverRideEx {
	void calculate(double x) {
		System.out.println("Square= " + (x * x));
	}
}

class OverRideEx1 extends OverRideEx {
	void calculate(double x) {
		super.calculate(2);
		System.out.println("Square root value= " + Math.sqrt(x));
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		OverRideEx1 ore = new OverRideEx1();
		ore.calculate(25);
		ore.calculate(9);
		ore.calculate(36);
	}
}
