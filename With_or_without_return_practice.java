package com.lamda;

import java.util.Scanner;

interface withorwithout_return{
	public int display(int a);
}

public class With_or_without_return_practice {
	public static void main(String[] args) {
		withorwithout_return withreturn = (x) -> x;
		withorwithout_return withoutreturn = (y) -> {
			return y;
		};
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of num:");
		num = sc.nextInt();
		
		System.out.println("Without return: "+withoutreturn.display(num));
		System.out.println("With return: "+withreturn.display(num));
	}
}
