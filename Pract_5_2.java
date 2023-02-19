package com.lamda;

import java.util.Scanner;

interface SingleParameter{
	public int display(int a);
}

public class Pract_5_2{
	public static void main(String[] args) {
		SingleParameter sp = (int x) -> {
			return x;
		};
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		num = sc.nextInt();
		
		System.out.println("Number entered by the user is "+sp.display(num));
		
	}
}
