package com.andrey.coliseumd;

public class ComputerTest extends Neuron{

	
	@Override
	void oneTypeOfComputers() {
		// TODO Auto-generated method stub
		super.oneTypeOfComputers();
	}

	int RamMemory = 512;
	int CPUmemory = 1000;
	int VideoMemory = 4000;
	
	void changeRamMemory(int newValue) {
		RamMemory = newValue;
	}
	
	void changeCPUmemory(int time) {
		CPUmemory = CPUmemory + time;
	}
	
	void changeVideoMemory(int speed) {
		VideoMemory = VideoMemory + speed;
	}
	
	void printStates() {
		
		System.out.println("RamMemory = " + RamMemory 
				+ " CPUmemory = " + CPUmemory + 
				" VideoMemory = " + VideoMemory);
	}
}

