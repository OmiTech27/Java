package com.lamda;

interface HelloWorld{
	public void display();
}

public class Pract_5_1{
	public static void main(String[] args) {
		HelloWorld hw = () -> System.out.println("Hello World!");
		hw.display();
	}
}