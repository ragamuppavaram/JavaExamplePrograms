package java_homework;

class Box {
	private double width;
	private double height;
	private double depth;

	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxWeight extends Box {
	double weight;

	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	BoxWeight() {
		super();
		weight = -1;

	}

	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

public class DemoSuper {
	public static void main(String argts[]) {
		BoxWeight boxweight = new BoxWeight(10, 20, 15, 34.5);
		BoxWeight boxweight1 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight boxweight2 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(boxweight);
		double vol;
		vol = boxweight.volume();
		System.out.println("Volume of boxweight is " + vol);
		System.out.println("Weight of boxweight is " + boxweight.weight);
		System.out.println();

		vol = boxweight1.volume();
		System.out.println("Volume of boxweight1 is " + vol);
		System.out.println("Weight of boxweight is " + boxweight1.weight);
		System.out.println();

		vol = boxweight2.volume();
		System.out.println("Volume of boxweight2 is " + vol);
		System.out.println("Weight of boxweight is " + boxweight2.weight);
		System.out.println();

		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + myclone.weight);
		System.out.println();

		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();
	}
}
