package com.Oopsagain.zak;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan=new Fan("Bajaj",0.2542,"Blue");
		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}
