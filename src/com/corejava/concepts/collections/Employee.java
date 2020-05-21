package com.corejava.concepts.collections;

public class Employee {
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Employee() {
	}
	@Override
	public int hashCode() {
		return eid;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(emp.eid==this.eid && emp.ename.equals(this.ename)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return ""+eid;
	}
	
	
}
