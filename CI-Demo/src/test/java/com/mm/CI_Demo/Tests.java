package com.mm.CI_Demo;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import org.testng.annotations.Test;
public class Tests {

	@Test
	public void Test1() {
		System.out.println("Running Test1");
		assertEquals(10,10);
	}
	@Test
	public void Test2() {
		System.out.println("Running Test2");
		assertEquals("Guru", "Guru");
	}
	@Test
	public void Test3() {
		System.out.println("Running Test3");
		assertEquals("Raja","Raja");
	}
	
}
