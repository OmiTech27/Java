package com.lamda;

import java.util.Scanner;

interface WithorWithoutReturn{
	public int apply(int a, int b);
}

public class Pract_5_5 {
	public static void main(String[] args) {
		WithorWithoutReturn withoutReturn = (x, y) -> (x-y);
		int num1, num2;
		System.out.print("Enter first number:");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		System.out.print("Enter second number:");
		num2 = sc.nextInt();

		System.out.println("Subtraction of "+num1+" - "+num2+" without return = "+withoutReturn.apply(num1, num2));
		
		WithorWithoutReturn withReturn = (int x, int y) -> {
			return x-y;
		};
		
		System.out.println("Subtraction of "+num1+" - "+num2+" with return = "+withReturn.apply(num1, num2));
		
		
	}
}
