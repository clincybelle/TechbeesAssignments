package com.maven.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCalculator {
	

	@Test
    public void testsum() {

	System.out.println("sum");

	Integer x = 15;

	Integer y = 15;

	Integer result = x+y;

	assertTrue(result==Calculator.add(x, y));

}
	
	@Test
	public void testsub() {
		Integer x=20;
        Integer y=7;
        Integer expected= 13;
       Integer result= Calculator.sub(x, y);
       assertEquals(expected,result);
	}
	
	@Test
	public void testmul() {
		Integer x=20;
        Integer y=5;
        Integer expected= 100;
       Integer result= Calculator.mul(x, y);
       assertEquals(expected,result);
	}
	@Test
	public void testdiv() {
		Integer x=20;
        Integer y=5;
        Integer expected= 4;
       Integer result= Calculator.div(x, y);
       assertEquals(expected,result);
	}
	@Test
	public void testsub2() {
		Integer x=10;
        Integer y=7;
        Integer expected= 3;
       Integer result= Calculator.sub(x, y);
       assertEquals(expected,result);
	}
	
	@Test
	public void testdiv1() {
		Integer x=40;
        Integer y=2;
        Integer expected= 20;
       Integer result= Calculator.div(x, y);
       assertEquals(expected,result);
	}
	
}
