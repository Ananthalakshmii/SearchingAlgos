package com.algorithms.search;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {2,3,4,10,40};
		int search=10;
		
		int result=find(arr,search);
		System.out.println("element found at "+result);

	}

	private static int find(int[] arr, int search) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]==search)
				return i;
		}
			
		return -1;
	}

}

//o(n)