package com.pro;

import java.util.function.DoubleUnaryOperator;

public class ConvertKtoM {

	public static void main(String[] args) {
		DoubleUnaryOperator convertKilometersToMiles = (double k) -> k * 1.609344;
		
	    double miles = convertKilometersToMiles.applyAsDouble(10);
	    System.out.println(miles); 
	}

}
