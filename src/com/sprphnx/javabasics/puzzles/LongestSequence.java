package com.sprphnx.javabasics.puzzles;

/*
 * Find the longest sequence in of number in a given array.
 */

public class LongestSequence {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,4,3,4,2,3,4,5,0,1,4};
		longestSequence(a);
	}

	private static void longestSequence(int[] a) {
		int i=1;
		int maxSequenceLength = 0;
		int position = 0;
		int length = 0;
		
		while(i<a.length) {
			
			if(a[i]==a[i-1]+1) {
				length++;
			} else {
				if(maxSequenceLength<length) {
				maxSequenceLength = length;
				position = i - (length+1);
				 
				}
				length=0;
				
			}
			i++;			
		}
		
		System.out.println("Start position: "+position +"\n"+"Length of the sequence: "+maxSequenceLength);
		for(int j=position; j<=(position+maxSequenceLength); j++) {
			System.out.print(a[j]+" ");
		}
	}

}
