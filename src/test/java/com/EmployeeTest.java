package com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	List<Employee> e = new ArrayList<>();

//	@Test
//	void testEmployee() {
//		fail("Not yet implemented");
//	}

	@Test
	void testAdd() {
		Employee e1=new Employee(5,"Praveen",25);
		int s=e.size();
		e1.addToList(e,e1);
		assertEquals(s+1,e.size());
	}

}
