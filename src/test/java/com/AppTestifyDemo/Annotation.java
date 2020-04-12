package com.AppTestifyDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	public Annotation() {
		System.out.println("First Constructor");
	}
	public Annotation(String Str1) {
		System.out.println("Second constrctor");
		
	}
	
	@BeforeTest(alwaysRun=true)
	public void zest1() {
		System.out.println("Test1");
	}
	
	@BeforeTest(alwaysRun=true)
	
	public void zest2() {
		System.out.println("zest2");
	}
	@BeforeTest(dependsOnMethods="zest1")
	public void test2() {
		System.out.println("Test2");
	}
	@Test
	
	public void test() {
		System.out.println("Run");
	}
	

	@BeforeMethod
	public void testM1() {
		System.out.println("Testm1");
	}
	@BeforeMethod
	public void testM2() {
		System.out.println("Testm2");
	}

}
