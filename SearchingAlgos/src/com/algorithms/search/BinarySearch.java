package com.algorithms.search;
//works with sorted arrays
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,3,4,10,40};
		int search=10;
		int len=arr.length;
		int result=binarySearch(arr,search,0,len);
		System.out.println("element found in "+result);

	}

	private static int binarySearch(int[] arr, int search, int start, int end) {
		int mid=(start+end)/2;
		if(arr[mid]<search)
			return binarySearch(arr, search, mid+1, end);
		else if(arr[mid]>search)
			return binarySearch(arr, search, 0, mid-1);
		else if(arr[mid]==search)
			return mid;
		return -1;
	}

}

//o(log n)