package com.andrey.coliseumd;

public class Computer {

	public static void main(String[] args) {
		
		ComputerTest Computer = new ComputerTest();
		Bicycle Computer2 = new Bicycle();
		
		
		System.out.println("Computer instanceof Parent: " + (Computer instanceof ComputerTest));
		System.out.println("Computer2 instanceof Bicycle: " + (Computer2 instanceof Bicycle));
		System.out.println("Computer instanceof Interface: " + (Computer instanceof Interface));
		System.out.println("Computer2 instanceof Parent: " + (Computer2 instanceof Interface));
}
}

	
