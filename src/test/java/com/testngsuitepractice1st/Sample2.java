package com.testngsuitepractice1st;

import org.testng.annotations.Test;

public class Sample2 {

	@Test(groups = "regression")
	public void d()
	{
		System.out.println("regression testcase");
	}
	
	@Test(groups = "smoke")
	public void e()
	{
		System.out.println("smoke testcase");
	}
	
	@Test(groups = "regression")
	public void f()
	{
		System.out.println("regression testcase");
	}
}
