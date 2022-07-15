package com.algorithms.search;

public class RecursiveSubstringSearch {

	public static void main(String[] args) {
		System.out.println(contains("geeksforgeeks","geeks",0,0));
		System.out.println(contains("geeksforgeeks", "geeksquiz", 0, 0));
        System.out.println(contains("geeksquizgeeks", "quiz", 0, 0));

	}

	private static int contains(String text, String pattern, int text_index, int pattern_index) {
		if(text_index==text.length()) //text string is empty
			return 0;
		if(text.charAt(text_index)==pattern.charAt(pattern_index)) { //charAt text and pattern is same
			if(patternMatch(text,pattern,text_index,pattern_index)==1) //check for entire substring
				return 1;
			else
				return contains(text, pattern, text_index+1, pattern_index); //increment text string in case not found
		}
		return contains(text, pattern, text_index+1, pattern_index); //increment text string
	}

	private static int patternMatch(String text, String pattern, int text_index, int pattern_index) {
		if(text_index==text.length() && pattern_index!=pattern.length()) //text string reached last but pattern is still remaining
			return 0;
		if(pattern_index==pattern.length()) //pattern has reached its final position
			return 1;
		if(text.charAt(text_index)==pattern.charAt(pattern_index)) //charAt text and pattern matches
			return patternMatch(text, pattern, text_index+1, pattern_index+1); //increment both text and pattern to check for next char match
		return 0;
	}
	

}

//o(n*m)