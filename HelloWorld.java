package com.pro;

public class HelloWorld {

	public static void main(String[] args) {
		 Runnable r = () -> System.out.println("Hello World");
		    r.run();
		 }
	}