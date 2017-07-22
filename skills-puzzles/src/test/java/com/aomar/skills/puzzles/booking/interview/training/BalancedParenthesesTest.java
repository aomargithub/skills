package com.aomar.skills.puzzles.booking.interview.training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BalancedParenthesesTest {
	


	BalancedParentheses balancedParentheses = null;
	
	@Before
	public void setup(){
		balancedParentheses = new BalancedParentheses();
	}
	
	@Test
	public void test1_success(){
		assertEquals(true, balancedParentheses.isBalanced("{}"));
	}
	
	@Test
	public void test2_success(){
		assertEquals(true, balancedParentheses.isBalanced("()"));
	}
	
	@Test
	public void test3_success(){
		assertEquals(true, balancedParentheses.isBalanced("[]"));
	}
	
	@Test
	public void test4_success(){
		assertEquals(true, balancedParentheses.isBalanced("({[]})"));
	}
	
	@Test
	public void test5_success(){
		assertEquals(false, balancedParentheses.isBalanced("({[]}){"));
	}
	
	@Test
	public void test6_success(){
		assertEquals(true, balancedParentheses.isBalanced("a(bcd)d"));
	}
	
	@Test
	public void test7_success(){
		assertEquals(false, balancedParentheses.isBalanced("(kjds(hfkj)sdhf"));
	}
	
	@Test
	public void test8_success(){
		assertEquals(false, balancedParentheses.isBalanced("(sfdsf)(fsfsf"));
	}
	
	@Test
	public void test9_success(){
		assertEquals(true, balancedParentheses.isBalanced("{[]}()"));
	}
	
	@Test
	public void test10_success(){
		assertEquals(false, balancedParentheses.isBalanced("{[}]"));
	}
}
