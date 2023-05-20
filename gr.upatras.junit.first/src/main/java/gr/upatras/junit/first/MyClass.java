package gr.upatras.junit.first;

public class MyClass {
	 // the following is just an example
	 public String biggerThanZero(int x, int y) {
		 String a;
		 if (x - y > 0) {
			a = "POSITIVE";
		 }
		 else if (x - y < 0) {
			 a = "NEGATIVE";
		 }
		 else{
			 a = "ZERO";
		 }
		 return a;
	 }
	}