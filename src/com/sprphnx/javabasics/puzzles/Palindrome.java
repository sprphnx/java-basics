package com.sprphnx.javabasics.puzzles;

public class Palindrome {

	public static void main( String[] args) {

		Integer[] a = { 1,2,3,4,1,3,2,1 };

		boolean check = isPalindrome(a, 0, (a.length-1));
		
		System.out.println(check);

		}

		private static boolean isPalindrome ( Integer[] a, Integer start, Integer end) {
		if (start>end){
			return true;
		} else if(a[start]==a[end]) {
			start++;
			end--;
			return isPalindrome ( a, start, end);
		} else {
			return false;
		}
	
	
}
}
