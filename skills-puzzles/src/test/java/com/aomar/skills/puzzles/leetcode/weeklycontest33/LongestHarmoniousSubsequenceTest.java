package com.aomar.skills.puzzles.leetcode.weeklycontest33;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestHarmoniousSubsequenceTest {

	LongestHarmoniousSubsequence longestHarmoniousSubsequence = null;
	
	@Before
	public void setup(){
		longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();
	}
	
	@Test
	public void findLHS1_success(){
		int lhs = longestHarmoniousSubsequence.findLHS(new int[]{1,3,2,2,5,2,3,7});
		
		assertEquals(5, lhs);
	}
	
	@Test
	public void findLHS2_success(){
		int lhs = longestHarmoniousSubsequence.findLHS(new int[]{2,2,2,2,2,2,2,3,1,0,0,0,3,1,-1,0,1,1,0,0,1,1,2,2,2,0,1,2,2,3,2});
		
		assertEquals(20, lhs);
	}
	
	@Test
	public void findLHS3_success(){
		int lhs = longestHarmoniousSubsequence.findLHS(new int[]{1,0,2,0,1,2,3,1,1,1,3,3,3,1,0,3,0,3,1,3,-1,2,2,1,1,3,1});
		
		assertEquals(14, lhs);
	}
	
	@Test
	public void findLHS4_success(){
		int lhs = longestHarmoniousSubsequence.findLHS(new int[]{1,1,1,1});
		
		assertEquals(0, lhs);
	}
	
	@Test
	public void findLHS5_success(){
		int lhs = longestHarmoniousSubsequence.findLHS(new int[]{1,4,1,3,1,-14,1,-13});
		
		assertEquals(2, lhs);
	}
	

}
