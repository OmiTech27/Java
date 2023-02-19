package com.pro;

import java.util.function.IntBinaryOperator;

public class LambdaExpression2 {

	public static void main(String[] args) {
		IntBinaryOperator addInts = (int x, int y) -> x + y;
	    int result = addInts.applyAsInt(10, 20);
	    System.out.println(result); 
	}

}