package com.generics;

public class Generic_methods {
	public static <E> void printArray(E[] elements) {
		for(E element: elements) {
			System.out.print(element+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50};
		Character[] charArray = {'A','D','V','A','N','C','E'};
		
		System.out.println("Printing Integer Array:");
		printArray(intArray);
		
		System.out.println("Printing Character Array:");
		printArray(charArray);
	}
}
