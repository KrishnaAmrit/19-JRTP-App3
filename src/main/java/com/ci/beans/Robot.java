package com.ci.beans;

public class Robot {
	private Motor motor;
	private Genrator genrator;
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public void setGenrator(Genrator genrator) {
		this.genrator = genrator;
	}

	public void boot() {  
     System.out.println("booting is start...");
	}
	
	}
