package com.andrey.newprojecta;

public class OperatorIf {

	public static void main(String[] args) {
		int value = 2;
		int value1 = 3;
		int result;
		if(value == value1)
			System.out.println("value=value1");
		if((value != value1) && (value <= value1))
			System.out.println("value!=value1 and value <= value1");
		if(value > value1)
			System.out.println("value > value1");
		if ((value < value1) || (value > value1))
			System.out.println("value < value1 or value > value1");
		if (value <= value1)
			System.out.println("value <= value1");
		
	result = (value > value1) ? value : value1;
		
System.out.println(result);
	}

}
