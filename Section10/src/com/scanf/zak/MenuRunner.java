package com.scanf.zak;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter num1:");
		int num1= scan.nextInt();
		
		System.out.print("Enter num2:");
		int num2= scan.nextInt();
		System.out.println("Choices available are");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Div");
		System.out.println("4.Mul");
		System.out.println("Enter Choice:");
		int choice=scan.nextInt();
		System.out.println("Your Choice is");
		System.out.println("num1" +num1);
		System.out.println("num2"+num2);
		System.out.println("Choice"+choice);
		performOperationUsingSwitch(num1, num2, choice);
	}

	private static void performOperationUsingSwitch(int num1, int num2, int choice) {
		switch(choice) {
		case 1:
			System.out.println("Result"+(num1+num2));
			break;
		case 2:
			System.out.println("Result"+(num1-num2));
			break;
		case 3:
			System.out.println("Result"+(num1/num2));
			break;
		case 4:
			System.out.println("Result"+(num1*num2));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}

}
