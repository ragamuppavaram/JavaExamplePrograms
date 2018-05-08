package java_homework;

class Theatre implements Runnable {
	String str;

	Theatre(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println(str + " " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

} 

public class RunnableInterfaceDemo {
	public static void main(String[] args) {
		Theatre obj = new Theatre("cut ticket");
		Theatre obj1 = new Theatre("see movie");
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		t1.start();
		t2.start();

	}
}
