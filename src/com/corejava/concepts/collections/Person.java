package com.corejava.concepts.collections;

public class Person {
	private String name;
	private int age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {

	}
	@Override
	public int hashCode() {
		int res = name.hashCode();
		res = 5*res +age;
		return res;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person per = (Person)obj;
			return(per.name.equals(this.name)&& per.age==(this.age));
		}else {
		return false;
		}
	}
	
}
