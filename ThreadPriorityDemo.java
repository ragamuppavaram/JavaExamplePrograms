package java_homework;

public class ThreadPriorityDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			String str = Thread.currentThread().getName();
			System.out.println(str + " " + i);
		}
	}

	public static void main(String[] args) {
		ThreadPriorityDemo pd1 = new ThreadPriorityDemo();
		ThreadPriorityDemo pd2 = new ThreadPriorityDemo();
		pd1.setName("First");
		pd2.setName("Second Thread");

		pd2.setPriority(MAX_PRIORITY);
		pd2.setPriority(8);
		pd1.setPriority(MIN_PRIORITY);
		pd1.start();
		pd2.start();

		System.out.println("Priority of pd1 is " + pd1.getPriority());
		System.out.println("Priority of pd2 is " + pd2.getPriority());
	}
}
