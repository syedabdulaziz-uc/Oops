package com.abc.pak;

public class MotorBike {
	private int speed;
	MotorBike(int speed){
		this.speed=speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch) {
		this.speed=this.speed+howMuch;
	}
	void start() {
		System.out.println("Bike Started");
	}
}
