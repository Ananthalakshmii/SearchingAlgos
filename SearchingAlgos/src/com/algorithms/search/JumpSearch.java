package com.algorithms.search;

import javax.naming.spi.DirStateFactory.Result;

/*
 works with sorted array
 The increasing order of performance is: linear search  <  jump search  <  binary search
 */
public class JumpSearch {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
		int search = 55;
		
		int index=jumpSearch(arr,search);
		System.out.println("element found at "+index);
		
	}

	private static int jumpSearch(int[] arr, int search) {
		int len=arr.length;
		int blocks=(int) Math.floor(Math.sqrt(len));
		int prev=0;
		
		while(arr[blocks]<search) {
			prev=blocks;
			blocks=blocks+(int) Math.floor(Math.sqrt(len));
			if(blocks>=len)
				return -1;
		}
		while(arr[prev]<search) {
			prev++;
			if(prev==Math.min(blocks, len))
				return -1;
		}
		if(arr[prev]==search)
			return prev;
		return -1;
	}

}

//o(sqrt(n))
