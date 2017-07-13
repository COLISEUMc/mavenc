package com.andrey.coliseumd;

public class ComputerTest implements Interface {

 
	int RamMemory = 512;
	int CPUmemory = 1000;
	int VideoMemory = 4000;
	public void changeRamMemory(int newValue) {
		RamMemory = newValue;
		
	}
	public void changeCPUmemory(int time) {
		CPUmemory = time + CPUmemory;
		
	}
	public void changeVideoMemory(int speed) {
		VideoMemory = speed + VideoMemory;
		assert (VideoMemory > 7000);
	}
	public void printStates() {
		
		System.out.println("RamMemory = " + RamMemory 
				+ " CPUmemory = " + CPUmemory + 
				" VideoMemory = " + VideoMemory);
	}
}


