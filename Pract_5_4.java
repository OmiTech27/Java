package com.lamda;

import java.util.Scanner;

interface Pract_5__4<type1, r>{
	public r apply(type1 x);
}

public class Pract_5_4 {
	public static void main(String[] args) {
		
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		Pract_5__4 <Double, Double> fahrtocel = (Double x) -> {
			return ((x-32)*5)/9;
		};
		
		
		System.out.println("Fahrenheit to Celsius: "+fahrtocel.apply(num));
		
		Pract_5__4 <Double, Double> KilToMiles = (Double x) -> {
			return x*0.62137119;
		};
		
		System.out.println("Kilometer to Miles: "+KilToMiles.apply(num));
	}
}
