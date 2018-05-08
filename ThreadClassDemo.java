package java_homework;

class ThrDemo extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadClassDemo {
	public static void main(String[] args) {
		ThrDemo td = new ThrDemo();
		Thread t = new Thread();
		t.start();
	}
}
