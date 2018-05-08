package java_homework;

class Reserve implements Runnable {
	int available = 3;
	int wanted;

	Reserve(int i) {
		wanted = i;
	}

	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("The number of berths available= " + available);
			if (available >= wanted) {
				String name = Thread.currentThread().getName();
				System.out.println(wanted + " " + "berths allowed for" + " " + name);
				try {
					Thread.sleep(1000);
					available = available - wanted;
				} catch (Exception e) {
				}
			} else {
				System.out.println("Sorry no berth allowed for next thread");
			}
		}

	}

}

public class ThreadSafeDemo {
	public static void main(String[] args) {
		Reserve obj = new Reserve(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		t4.setName("Fourth Thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
