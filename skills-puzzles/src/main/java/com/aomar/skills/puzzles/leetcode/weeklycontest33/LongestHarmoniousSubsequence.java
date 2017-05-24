package com.aomar.skills.puzzles.leetcode.weeklycontest33;

public class LongestHarmoniousSubsequence {
	
	public int findLHS(int[] nums) {
		
		int[] lhs1 = new int[nums.length]; 
		int[] lhs2 = new int[nums.length]; 
		int lhsArrIndex1 = 1;
		int lhsArrIndex2 = 1;
		boolean consider1 = false;
		boolean consider2 = false;
		int lhsl = 0;
		
		for(int i = 0; i < nums.length; i ++){
			
			
			lhs1[0] = nums[i];
			lhs2[0] = nums[i];
			lhsArrIndex1 = 1;
			lhsArrIndex2 = 1;
			consider1 = false;
			consider2 = false;
			
			for(int j = i + 1; j < nums.length; j++){
				if(lhs1[0] == nums[j] ||  lhs1[0] == nums[j] + 1){
					lhs1[lhsArrIndex1++] = nums[j];
					
					if(lhs1[0] != nums[j]){
						consider1 = true;
					}
				}
				
				if(lhs2[0] == nums[j] ||  lhs1[0] == nums[j] - 1){
					lhs2[lhsArrIndex2++] = nums[j];
					
					if(lhs2[0] != nums[j]){
						consider2 = true;
					}
				}
				
			}
			
			if(lhsArrIndex1 >= lhsArrIndex2 && lhsArrIndex1 > lhsl && consider1){
				lhsl = lhsArrIndex1;
			} else{
				if(lhsArrIndex2 > lhsl && consider2 ){
					lhsl = lhsArrIndex2;
				}
			}
			
		}
		
		return lhsl;      
    }
}
