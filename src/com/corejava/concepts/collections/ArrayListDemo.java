package com.corejava.concepts.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String as[]) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("orange");
	al.add("mango");
	al.add("watermelon");
	al.add("apple");
	
	System.out.println(al);
	
	for(String fruits : al) {
		System.out.println("Fruits : "+fruits);
	}
	}
}
