package com.calculator.tester;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.calculator.dao.CalculatorDao;

public class TesterCalculator {
	
	CalculatorDao obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj = new CalculatorDao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Junit running");;
	}
	
	@Test
	public void testCheckDivide() {
		double actualResult = obj.division(4.8, 2.2);
		assertNotEquals(1.18, actualResult);
	}
	
	@Test
	public void testIntAddition() {
		int actualResult = obj.addition(4, 5);
		assertEquals(9,actualResult);
	}
	
//	@Test
//	public void testDoubleAddition() {
//		double result = obj.addition(3.2, 4.8);
//		assertEquals(8,result);
//	}
	
	@Test
	public void testStringAddition() {
		String actualResult = obj.addition("Ram ","Sita");
		assertEquals("Ram Sita",actualResult);
	}
	
	@Test
	public void testMultiplication() {
		int result = obj.multiplication(2, 5);
		assertEquals(10,result);
	}
	
	@Test
	public void testSubstraction() {
		int result = obj.substraction(9, 7);
		assertEquals(2,result);
	}

}
