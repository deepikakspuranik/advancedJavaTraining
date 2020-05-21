package com.corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CountFreqOfElements {

	public static void main(String as[]) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("d");
		
		//count the frequency of occurance of repeated elements 
		Set s = new HashSet(list);
		for(Object temp : s) {
			System.out.println("Occurance of each character  "+temp+": "+Collections.frequency(list, temp));
		}
		
		
		//adding repeated elements in seperate set
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		
		for(Object obj : list) {
			if(!s1.add(obj)) {
				s2.add(obj);
			}
		}
		System.out.println("oject in set 2 : "+s2);
		
		//remove repeated elements from arraylist
		List newList = new ArrayList(new HashSet<>(list));
		Iterator it = newList.iterator();
		while(it.hasNext()) {
			System.out.println("New List contains : "+it.next());
		}
		
		//converting list to set
		Set convertedList = new HashSet(list);
		System.out.println("converted list : "+convertedList);
	}
}
