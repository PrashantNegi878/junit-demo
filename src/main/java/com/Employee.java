package com;

import java.util.*;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	
	List<Employee> e= new ArrayList<>();
	
	Employee(int i, String string, int j)
	{
		this.id=i;
		this.name=string;
		this.age=j;
	}
	
	public void addToList(List<Employee> e,Employee e1)
	{
		e.add(e1);
		System.out.print(e);
	}

}
