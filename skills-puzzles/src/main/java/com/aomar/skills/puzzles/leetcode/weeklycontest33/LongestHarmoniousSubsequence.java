package com.aomar.skills.puzzles.leetcode.weeklycontest33;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
	
	public int findLHS(int[] nums) {
		
		int lhs = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num : nums){
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for(int num : map.keySet()){
			lhs = Math.max(lhs, map.get(num + 1) + map.get(num));
		}
		return lhs;		
	}
}
