package gr.upatras.junit.first;

import gr.upatras.junit.first.MyClass;

public class MyMain {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		String result = m.biggerThanZero(45, 399);
		String result2 = m.biggerThanZero(450, 399);
		String result3 = m.biggerThanZero(399, 399);
		System.out.println("The first result whose value must spell out NEGATIVE is:  "+ result);
		System.out.println("The first result whose value must spell out POSITIVE is:  "+ result2);
		System.out.println("The first result whose value must spell out ZERO is:  "+ result3);
	}
}
