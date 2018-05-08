package java_homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cone {
	public int varone;
	public float vartwo;
	public String varthr;
}

class Ctwo1 implements Serializable {
	public int varone;
	public float vartwo;
	public String varthr;
	public transient Cone varfr;
}

class Ctwo2 implements Serializable {
	public static int a;
	public float b;
	public String c;

	public Ctwo2(int a1, float b1, String c1) {
		a = a1;
		b = b1;
		c = c1;
	}

	public void print() {
		System.out.println("value of a= " + a);
		System.out.println("value of b= " + b);
		System.out.println("value of c= " + c);
	}
}

class Ctwo implements Serializable {
	public int varone;
	public float vartwo;
	public String varthr;
}

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Ctwo o = new Ctwo();
		o.varone = 10;
		o.vartwo = 22.5f;
		o.varthr = new String("Hello");
		FileOutputStream fos = new FileOutputStream("TestSer1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o);

	}
}
