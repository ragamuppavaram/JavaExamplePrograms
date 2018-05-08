package java_homework;

class Thread1 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Thread1: " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Thread2: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class MultiThreadDemo {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}
}
