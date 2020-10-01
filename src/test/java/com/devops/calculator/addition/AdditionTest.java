package com.devops.calculator.addition;

//importing junit
import junit.framework.TestCase;

public class AdditionTest extends TestCase{
		
	Addition add=new Addition();

	public AdditionTest(String name){
		super(name);
	}
	
	public void testSumOfTwoPositiveNumbers(){
		assertEquals(700.00,add.addition(300,400));
		System.out.println("testSumOfTwoPositiveNumbers: "+add.addition(300,400));
	}
	public void testSumOfTwoNegativeNumbers(){
		assertEquals(-700.00,add.addition(-400,-300));
		System.out.println("testSumOfTwoNegativeNumbers: "+add.addition(-400,-300));
	}
	public void testSumOfTwoOnePositiveAndNegativeNumbers(){
		assertEquals(-100.00,add.addition(-400,300));
		System.out.println("testSumOfTwoOnePositiveAndNegativeNumbers: "+add.addition(-400,300));
	}
	public void testSumOfTwoOneBigPostiveAndNegativeNumbers(){
		assertEquals(100.00,add.addition(400,-300));
		System.out.println("testSumOfTwoOneBigPostiveAndNegativeNumbers: "+add.addition(400,-300));
	}
	public void testSumOfTwoOneFloatAndOneIntegerNumbers(){
		assertEquals(700.50,add.addition(400.50,300));
		System.out.println("testSumOfTwoOneFloatAndOneIntegerNumbers: "+add.addition(400.50,300));
	}
	public void testSumOfTwoFloatNumbers(){
		assertEquals(700.00,add.addition(400.50,299.50));
		System.out.println("testSumOfTwoFloatNumbers: "+add.addition(400.50,299.50));
	}
	
}