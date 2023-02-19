package com.pro;

import java.util.function.Function;

public class ConvertCtoF {

	public static void main(String[] args) {
		 Function<Integer,Double> centToFahrenheitInt = x -> new Double((x*9/5)+32);
		    double fahrenheit = centToFahrenheitInt.apply(32);
		    System.out.println("Centigrade to Fahrenheit: "+fahrenheit);
	}

}
