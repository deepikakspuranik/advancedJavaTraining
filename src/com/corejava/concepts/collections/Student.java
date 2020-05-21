package com.corejava.concepts.collections;

public class Student implements Comparable{

	private int rollNum;
	private String name;
	private int age;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int rollNum, String name, int age) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
	}
	public Student() {
	}
	@Override
	public int compareTo(Object o) {
		Student stu = (Student)o;
		
		//return this.age-stu.age;
		return this.name.compareTo(stu.name);
	}
}
