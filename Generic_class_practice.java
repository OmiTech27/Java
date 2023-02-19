package com.generic;

class Generic_class<T,A>{
	T x;
	A y;
	public void setX(T x) {
		this.x = x;
	}
	public T getX() {
		return x;
	}
	public void setY(A y) {
		this.y = y;
	}
	public A getY() {
		return y;
	}
}

public class Generic_class_practice {
	public static void main(String[] args) {
		Generic_class<String, Integer> obj1 = new Generic_class<String, Integer>();
		obj1.setX("Devansh");
		obj1.setY(21);
		System.out.println("My name is "+obj1.getX());
		System.out.println("My age is "+obj1.getY());
	}
}
