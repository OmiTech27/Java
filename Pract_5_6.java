package com.lamda;

import java.util.Scanner;

interface ConcatString{
	public String concat(String x, String y);
}

public class Pract_5_6 {
	public static void main(String[] args) {
		ConcatString join = (String a, String b) -> {
			return a+b;
		};
		
		String s1 = "", s2 = "";
		
		System.out.print("Enter the first string:");
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		
		System.out.print("Enter the second string:");
		s2 = sc.next();
		
		System.out.println("Concatenation of "+s1+" & "+s2+" = "+join.concat(s1, s2));
	}
}
