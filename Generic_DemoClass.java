package com.generic;
class GenericClass <T, A> {
	T x;
	A y;
	public void setX(T x)
	{
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

class Generic_DemoClass {

	public static void main(String[] args) {
		GenericClass<String, Integer> obj1 = new GenericClass<String, Integer>();
		obj1.setX("Devansh");
		System.out.println("Name: " +obj1.getX());
		obj1.setY(21);
		System.out.println("Age: " + obj1.getY());
	}
}