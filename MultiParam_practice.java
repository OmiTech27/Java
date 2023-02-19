package com.lamda;

import java.util.Scanner;

interface MultiParam{
	public void display(int a, int b);
}

public class MultiParam_practice {
	public static void main(String[] args) {
		MultiParam mp = (int x, int y) -> System.out.println("Addition of "+x+" + "+y+" = "+(x+y));
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of num1:");
		num1 = sc.nextInt();
		
		System.out.print("Enter the value of num2:");
		num2 = sc.nextInt();
		
		mp.display(num1, num2);
	}
}
