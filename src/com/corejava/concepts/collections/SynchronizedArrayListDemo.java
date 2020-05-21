package com.corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListDemo {

	public static void main(String as[]) {
		List al = new ArrayList();
		al.add("orange");
		al.add("mango");
		al.add("apple");
		al.add("papaya");
		
		al = Collections.synchronizedList(al);
		synchronized(al) {
			Iterator it = al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
	}
}
