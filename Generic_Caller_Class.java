package com.generic;
class Generic_Type_Class <T,A> {
	T x;
	A y;
	public void setX(T x, A y) {
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public A getY() {
		return y;
	}
}

class Generic_Caller_Class{
	public static void main(String[] args) {
		Generic_Type_Class<String,Integer> obj1 = new Generic_Type_Class<String,Integer>();
		obj1.setX("Devansh",20);
		System.out.println("Name: "+obj1.getX());
		System.out.println("Age: "+obj1.getY());
	}
}