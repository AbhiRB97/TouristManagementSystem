package com.testngsuitepractice1st;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups = "smoke")
	public void a()
	{
		System.out.println("smoke testcase");
	}
	
	@Test(groups = "regression")
	public void b()
	{
		System.out.println("regression testcase");
	}
	
	@Test(groups = "smoke")
	public void c()
	{
		System.out.println("smoke testcase");
	}

}
