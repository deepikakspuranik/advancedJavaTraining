package com.corejava.concepts.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EqualsHashCodeDemo {

	public static void main(String a[]) {
		Set<Person> person = new HashSet<Person>();
		person.add(new Person("Raj",21));
		person.add(new Person("Mythri",18));
		person.add(new Person("Raj",21));
		
		Iterator it = person.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee(1,"Deepu"));
		emp.add(new Employee(2,"Pavu"));
		emp.add(new Employee(3,"Deepu"));
		
		System.out.println(emp);
	}
}
