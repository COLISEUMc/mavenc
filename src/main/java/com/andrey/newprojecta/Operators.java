package com.andrey.newprojecta;

public class Operators {

	public static void main(String[] args) {
		int a = 1 + 3;
		System.out.println("print number: " +a);
		int originalResult = a;
		
		a = a-1;
		System.out.println(originalResult + " - 1 = " +a);
		originalResult = a;
		
		a=a*2;
		System.out.println(originalResult + "*2 = " +a);
		originalResult = a;
		
		a=a/2;
		System.out.println(originalResult + "/2 = " +a);
		
		a=a%2;
		System.out.println(originalResult + "%2 = " +a);
		
		a=a+8;
		System.out.println(originalResult + "+8= " +a);
		
		
		
	}

}
