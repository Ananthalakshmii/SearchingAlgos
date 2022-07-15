package com.algorithms.search;

public class TernarySearch {

	public static void main(String[] args) {
		 int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 int search=5;
		 int result=ternarySearch(arr,search,0,arr.length-1);
		 System.out.println("element found at "+result);
	}

	private static int ternarySearch(int[] arr, int search, int start, int end) {
		if(end>=start) {
			//int mid1=(start+end)/3;
			//int mid2=((start+end)/3)*2;
			 int mid1 = start + (end - start) / 3;
	         int mid2 = end - (end - start) / 3;
			if(arr[mid1]==search)
				return mid1;
			if(arr[mid2]==search)
				return mid2;
			if(search<arr[mid1])
				return ternarySearch(arr, search, start, mid1-1);
			else if(search>arr[mid2])
				return ternarySearch(arr, search, mid2+1, end);
			else
				return ternarySearch(arr, search, mid1+1, mid2-1);
			
		}
		return -1;
	}

}
