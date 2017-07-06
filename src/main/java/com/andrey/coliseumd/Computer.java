package com.andrey.coliseumd;

public class Computer {

	public static void main(String[] args) {
		
		ComputerTest Computer = new ComputerTest();
		Bicycle Computer2 = new Bicycle();
		
		
		Computer.changeRamMemory(500);
		Computer.changeCPUmemory(2000);
		Computer.changeVideoMemory(2000);
		Computer.oneTypeOfComputers();
		Computer.printStates();
		
		Computer2.changeRamMemory(800);
		Computer2.changeCPUmemory(5000);
		Computer2.changeVideoMemory(700);
		Computer2.changeRamMemory(300);
		Computer2.changeCPUmemory(30000);
		Computer2.changeVideoMemory(8000);
		Computer2.printStates();
		
}
}

	
