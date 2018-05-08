package java_homework;

import java.text.NumberFormat;

public class FactoryMethodDemo {
	public static void main(String[] args) {
		final double PI = 22 / 7;
		double r = 54.87;
		double area = PI * r * r;
		System.out.println("Area= " + area);
		NumberFormat obj = NumberFormat.getNumberInstance();
		obj.setMaximumFractionDigits(2);
		String str = obj.format(area);
		System.out.println("Formatted Area= " + str);
		obj.setMinimumFractionDigits(6);
		String str1 = obj.format(area);
		System.out.println("Formatted Area= " + str1);
	}
}
