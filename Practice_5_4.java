package com.lamda;

import java.util.Scanner;

interface conversion<type, return_type>{
	public return_type apply(type x);
}

public class Practice_5_4 {
	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextDouble();
		
		conversion<Double, Double> fahrtocel = (Double x) -> {
			return ((x-32)*5)/9;
		};
		
		conversion<Double,Double> kiltomet = (Double x) -> {
			return x*0.62137119;
		};
		
		System.out.println(num+" fahrenheit to celcius is "+fahrtocel.apply(num));
		
		System.out.println(num+" kilometre to miles is "+kiltomet.apply(num));
	}
}
