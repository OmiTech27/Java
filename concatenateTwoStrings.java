package com.pro;

import java.util.function.BiFunction;

public class concatenateTwoStrings {

	public static void main(String[] args) {
		BiFunction<String, String, String> concatStrings = (String s1, String s2) -> s1 + s2;
	    String result = concatStrings.apply("Hello", "Omkar");
	    System.out.println(result);
	}
}