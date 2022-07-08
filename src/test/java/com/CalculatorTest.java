package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {
	
	
	static Calculator c1;

	@BeforeAll
	public static void createCalculator()
	{
		c1= new Calculator();
		System.out.println("Started Testing");
	}
	
	@AfterAll
	public static void removeCalculator()
	{
		c1= null;
		System.out.println("Finished Testing");
	}
	
	@BeforeEach
	public void createeCalculator()
	{
		System.out.println("Before each test case");
	}
	
	@AfterEach
	public void removeeCalculator()
	{
		System.out.println("After each test case");
	}
	
	@Test
	void testAdd() {
		
		int actual=c1.add(10, 20);
		int expected=30;
		assertEquals(expected,actual,()->"Addition method is not working properly");
	}

	@Test
	void testSub() {
		
		int actual=c1.sub(20, 10);
		int expected=10;
		assertEquals(expected,actual,()->"Subtract method is not working properly");
		assertEquals(40,c1.sub(50, 10));
	
	}

	@Test
	void testMul() {
		
		int actual=c1.mul(10, 2);
		int expected=20;
		assertEquals(expected,actual,()->"Multiplication method is not working properly");
	}

	@Test
	void testDiv() {
		
		int actual=c1.div(20, 10);
		int expected=2;
		assertEquals(expected,actual,()->"Division method is not working properly");
		assertThrows(ArithmeticException.class,()->c1.div(5, 0));
	}

	
	@Test
	@EnabledOnOs(OS.LINUX)
	@EnabledForJreRange(min=JRE.JAVA_9,max=JRE.JAVA_18)
	@Disabled
	void demo()
	{
		System.out.println("Dummy test case");
	}

}
