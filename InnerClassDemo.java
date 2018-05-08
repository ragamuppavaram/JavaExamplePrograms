package java_homework;

class BankAcc {
	private double bal;

	BankAcc(double b) {
		bal = b;
	}

	void start(double r) {
		Interest in = new Interest(r);
		in.calculateInterest();
	}

	private class Interest {
		private double rate;

		Interest(double r) {
			rate = r;
		}

		void calculateInterest() {
			double interest = bal * rate / 100;
			System.out.println("Interest= " + interest);
			bal += interest;
			System.out.println("Balance= " + bal);
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		BankAcc bc = new BankAcc(1000);
		bc.start(3);

	}
}
