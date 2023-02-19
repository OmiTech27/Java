package com.generic;

class Test<T>
{
	T obj;
	Test(T obj) { 
	this.obj = obj; 
}
public T getObject() { 
	return this.obj; 
	}
}

public class Generic_class_example {
	public static void main (String[] args)
	{
	// instance of Integer type
	Test <Integer> iObj = new Test<Integer>(15); 
	System.out.println(iObj.getObject());
	
	Test <String> sObj = new Test<String>("ProgramNo1"); 
	System.out.println(sObj.getObject());
	}
}
