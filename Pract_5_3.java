package com.lamda;

import java.util.Scanner;

interface MultiParameter{
	public void display(int num1, int num2);
}

public class Pract_5_3 {
	public static void main(String[] args) {
		MultiParameter sum = (int x, int y) -> System.out.print("Sum of "+x+" + "+y+" = "+(x+y));
		
		int num1,num2;
		
		System.out.print("Enter the first number: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		num2 = sc.nextInt();
		
		sum.display(num1, num2);
	}
}
