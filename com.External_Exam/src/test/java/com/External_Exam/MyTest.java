package com.External_Exam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test1(){
		int age1=18;
		LoginApp l = new LoginApp();
		Assert.assertEquals(1, l.CheckVoteEligibility(age1));
	}
	
	@Test
	public void test2(){
		int age2=5;
		LoginApp l = new LoginApp();
		Assert.assertEquals(1, l.CheckVoteEligibility(age2));
	}
	
	@Test
	public void test3(){
		int age3=105;
		LoginApp l = new LoginApp();
		Assert.assertEquals(1, l.CheckVoteEligibility(age3));
	}
	
	@Test
	public void test4(){
		int age4=60;
		LoginApp l = new LoginApp();
		Assert.assertEquals(1, l.CheckVoteEligibility(age4));
	}
	
}
