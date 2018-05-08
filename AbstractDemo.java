package java_homework;

abstract class CarModel {
	int regno;

	CarModel(int regno) {
		this.regno = regno;
	}

	void fillTank() {
		System.out.println("Fill Tank");
	}

	abstract void steering(int direction);

	abstract void breaking(int force);
}

class Maruthi extends CarModel {

	Maruthi(int regno) {
		super(regno);
	}

	@Override
	void steering(int direction) {
		// TODO Auto-generated method stub
		System.out.println("Regno of Maruthi= " + regno);
		System.out.println("Maruthi uses manual steering= " + direction);
		System.out.println("Please Drive Maruthi Car");
		System.out.println("----------------------------------------");

	}

	@Override
	void breaking(int force) {
		// TODO Auto-generated method stub
		System.out.println("Breaking of Maruthi= " + force);
		System.out.println("Maruthi uses hydraulic breaks ");
		System.out.println("Apply breaks to stop the Car");

	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		Maruthi m = new Maruthi(6666);
		CarModel cm;
		cm = m;
		cm.fillTank();
		cm.steering(2);
		cm.breaking(100);

	}
}
