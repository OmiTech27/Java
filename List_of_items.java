package com.list;
import java.util.ArrayList;
public class List_of_items {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("List of Items of Type String:");
		list.add("Devansh");
		list.add("Abhishek");
		list.add("Suraj");
		list.add("Vinit");
		list.add("Mohit");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
