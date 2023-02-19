package com.lamda;

import java.util.Scanner;

interface two_strings{
	public String concatenate(String a, String b);
}

public class Concatenate_two_strings_practice {
	public static void main(String[] args) {
		two_strings c = (x,y)-> {
			return x+y;
		};
		
		String s1 = "", s2 = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first string:");
		s1 = sc.nextLine();
		
		System.out.print("Enter the second string:");
		s2 = sc.nextLine();
		
		System.out.println("Concatenation of two strings = "+c.concatenate(s1, s2));
	}
}
