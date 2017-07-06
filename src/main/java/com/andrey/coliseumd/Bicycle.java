package com.andrey.coliseumd;

public class Bicycle extends Neuron implements Interfaces2 {
	int RamMemory = 200;
	int CPUmemory = 400;
	int VideoMemory = 600;
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
	@Override
	void oneTypeOfComputers() {
		// TODO Auto-generated method stub
		super.oneTypeOfComputers();
	}
}

