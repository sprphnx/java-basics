package com.sprphnx.javabasics.puzzles;

/*
 * Reverse method to print numbers/alphabets in descending order.
 */

public class Reverse {

	public static void main(String[] args) {
		reverseNumbers(10);
		System.out.println("\n=======================================");
		reverseAlphabets('Y');
	}

	private static void reverseAlphabets(char c) {
		if(c>=65 && c<90) {
			System.out.print(c+" ");
			reverseAlphabets(--c);
		}

		if(c>=97) {
			System.out.print(c+" ");
			reverseAlphabets(--c);
		}
	}

	private static void reverseNumbers(int i) {
		if(i>0) {
			System.out.print(i+" ");
			reverseNumbers(--i);
		}
		
	}
	
}
