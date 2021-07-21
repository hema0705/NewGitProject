 package org.test;

public class Dept extends Student
{
	public void deptName() {
System.out.println("Student Department is IT");
	}
	public void deptId() {
		System.out.println("Department ID is 107");
	}
public static void main(String[] args) {
	Dept d=new Dept();
	d.collegeName();
	d.deptName();
	d.deptId();
	d.studName();
	d.id();
}
}
