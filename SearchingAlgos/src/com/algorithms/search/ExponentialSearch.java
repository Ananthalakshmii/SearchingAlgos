package com.algorithms.search;

import java.util.Arrays;
/*
 The idea is to start with subarray size 1, compare its last element with x, 
then try size 2, then 4 and so on until last element of a subarray is not greater. 
Once we find an index i (after repeated doubling of i), 
we know that the element must be present between i/2 and i 
(Why i/2? because we could not find a greater value in previous iteration)
 */
public class ExponentialSearch {

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 10, 40};
        int search = 10;
        int len=arr.length;
        int result=exponentialSearch(arr,search,len);
        System.out.println("element found at "+result);

	}

	private static int exponentialSearch(int[] arr, int search, int len) {
		if(arr[0]==search)
			return 0;
		int i=1;
		while(i<len && arr[i]<=search)
			i=i*2;
		return Arrays.binarySearch(arr, i/2, Math.min(i, len-1), search);
	
	}

}

//o(log n)