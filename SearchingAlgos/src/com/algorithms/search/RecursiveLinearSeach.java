package com.algorithms.search;

public class RecursiveLinearSeach {

	public static void main(String[] args) {
		int arr[] = {12, 34, 54, 2, 3};
		int search=3;
		
		int result=recursiveSearch(arr,search,0,arr.length-1);
		System.out.println("element found at "+result);
	}

	private static int recursiveSearch(int[] arr, int search, int start, int end) {
		if(end<start)
			return -1;
		if(arr[start]==search)
			return start;
		if(arr[end]==search)
			return end;
		return recursiveSearch(arr, search, start+1, end-1);
	}

}
