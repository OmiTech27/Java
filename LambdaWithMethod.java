package com.pro;

import java.util.function.IntFunction;

public class LambdaWithMethod {

	public static void main(String[] args) {
		IntFunction<String> intToString = (int x) -> {
		      return Integer.toString(x);
		    };

		    IntFunction<String> intToHex = (int x) -> Integer.toHexString(x);

		    String str = intToString.apply(10);
		    String hex = intToHex.apply(10);
		    System.out.println(str);
		    System.out.println(hex);
	}

}
