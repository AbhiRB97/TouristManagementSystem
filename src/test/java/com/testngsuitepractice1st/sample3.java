package com.testngsuitepractice1st;

import org.testng.annotations.Test;

public class sample3 {
	@Test(groups = "smoke")
	public void g()
	{
		System.out.println("smoke testcase");
	}
	
	@Test(groups = "regression")
	public void h()
	{
		System.out.println("regression testcase");
	}
	
	@Test(groups = "smoke")
	public void i()
	{
		System.out.println("smoke testcase");
	}
}
