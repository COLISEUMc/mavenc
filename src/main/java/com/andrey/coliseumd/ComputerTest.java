package com.andrey.coliseumd;

public class ComputerTest extends Neuron implements Interfaces2{

	
	@Override
	void oneTypeOfComputers() {
		// TODO Auto-generated method stub
		super.oneTypeOfComputers();
	}

	int RamMemory = 512;
	int CPUmemory = 1000;
	int VideoMemory = 4000;
	
	public void changeRamMemory(int newValue) {
		RamMemory = newValue;
	}
	
	public void changeCPUmemory(int time) {
		CPUmemory = CPUmemory + time;
	}
	
	public void changeVideoMemory(int speed) {
		VideoMemory = VideoMemory + speed;
	}
	
	public void printStates() {
		
		System.out.println("RamMemory = " + RamMemory 
				+ " CPUmemory = " + CPUmemory + 
				" VideoMemory = " + VideoMemory);
	}
}


