package com.testngsuitepractice2nd;

import org.testng.annotations.Test;

public class Sample7 {

	@Test(groups = "regression")
	public void p()
	{
		System.out.println("regression testcase");
	}
	
	@Test(groups = "smoke")
	public void q()
	{
		System.out.println("smoke testcase");
	}
	
	@Test(groups = "regression")
	public void r()
	{
		System.out.println("regression testcase");
	}
}
