package com.pro;

import java.util.function.IntConsumer;

public class LambdaExpression {

	public static void main(String[] args) {
		 IntConsumer printInt = (int x) -> System.out.println(x);
		 printInt.accept(10);
	}
}
