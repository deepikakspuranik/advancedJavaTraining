package com.corejava.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo{

	public static void main(String as[]) {
		List<Student> alStudent = new ArrayList<Student>();
		alStudent.add(new Student(1,"ramu",21));
		alStudent.add(new Student(2,"shamu",20));
		alStudent.add(new Student(3,"damu",23));
		
		System.out.println("Before sorting : ");
		
		Iterator it = alStudent.iterator();
		while(it.hasNext()) {
			Student stud = (Student)it.next();
			System.out.println(stud.getRollNum()+" "+stud.getName()+" "+stud.getAge());
		}
		
		System.out.println("After sorting : ");
		
		Collections.sort(alStudent);
		it = alStudent.iterator();
		while(it.hasNext()) {
			Student stud = (Student)it.next();
			System.out.println(stud.getRollNum()+" "+stud.getName()+" "+stud.getAge());
		}
	}

}
