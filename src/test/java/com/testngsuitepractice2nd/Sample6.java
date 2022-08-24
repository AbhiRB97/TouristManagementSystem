package com.testngsuitepractice2nd;

import org.testng.annotations.Test;

public class Sample6 {

	@Test(groups = "smoke")
	public void m()
	{
		System.out.println("smoke testcase");
	}
	
	@Test(groups = "regression")
	public void n()
	{
		System.out.println("regression testcase");
	}
	
	@Test(groups = "smoke")
	public void o()
	{
		System.out.println("smoke testcase");
	}
}
