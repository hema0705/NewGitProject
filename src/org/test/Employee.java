package org.test;

public class Employee {
public void emp(String Name) 
{
	System.out.println("Employee Name is " +Name);
}
public void emp(int id)
{
	System.out.println("Employee Id is "+id);
}
public void emp(double salary, long phno)
{
	System.out.println("Employee salary is "+salary+"\n" + phno);
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.emp("Hema");
	e.emp(7647);
    e.emp(45000,9765432107l);
}
}

