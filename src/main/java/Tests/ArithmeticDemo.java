package Tests;

public class ArithmeticDemo {
	public static void main (String[] args) {
		char[] copyFrom = {'a','b','c','d','e','r','f','t','q','s','d','f','j','o','r','a'};
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 12, 16);
		System.out.println(new String(copyTo));
	}
		
	}


