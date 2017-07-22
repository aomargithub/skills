package com.aomar.skills.puzzles.booking.interview.training;

import java.util.Stack;

public class BalancedParentheses {

	final static char lSquareBracket = '[', lParenthes = '(', lCurlyBrace = '{';
	final static char RSquareBracket = ']', RParenthes = ')', RCurlyBrace = '}';
	
	
	
	public  boolean isBalanced(String string){
		
		
		
		Stack<Integer> lParentheses = new Stack<Integer>();
		
		string.chars().forEach(singleChar -> {
			if(isOpeningParenthes(singleChar)){
				lParentheses.push(singleChar);
			}else{
				
				if(isClosingParenthes(singleChar)){
					if(lParentheses.isEmpty()){
						lParentheses.push(1);
						return;
					}else{
						if(isBalanced(lParentheses.peek(), singleChar)){
							lParentheses.pop();
						}
					}
				}
			}
		});
		
		
		return lParentheses.isEmpty();		
	}
	
	private  boolean isOpeningParenthes(int parenthes){
		return parenthes == lSquareBracket || parenthes == lParenthes || parenthes == lCurlyBrace;
	}
	
	private  boolean isClosingParenthes(int parenthes){
		return parenthes == RSquareBracket || parenthes == RParenthes || parenthes == RCurlyBrace;
	}
	
	private  boolean isBalanced(int lChar, int RChar){
		
		return (lChar == lSquareBracket && RChar == RSquareBracket) || 
			   (lChar == lParenthes && RChar == RParenthes) || 
			   (lChar == lCurlyBrace && RChar == RCurlyBrace);
	}

}
