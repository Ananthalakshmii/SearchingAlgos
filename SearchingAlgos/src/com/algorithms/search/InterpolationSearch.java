package com.algorithms.search;
/*
 works in sorted array
 interpolation search may go to different locations according to the value of the key 
 being searched. For example, if the value of the key is closer to the last element, 
 interpolation search is likely to start search toward the end side using formula
 
 position= end + (((end-start)/(arr[end]-arr[start]))*(search-arr[start]));
 
 interpolation search is an improvement over binary search
 */
public class InterpolationSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };
		int len=arr.length;
		int search=18;
		
		int result=interpolationSearch(arr,search,0,len-1);
		System.out.println("element found at "+result);

	}

	private static int interpolationSearch(int[] arr, int search, int start, int end) {
		int position;
		if(start<=end && arr[start]<=search && arr[end]>=search) {
			position= end + (((end-start)/(arr[end]-arr[start]))*(search-arr[start]));
			
			if(arr[position]==search)
				return position;
			if(arr[position]>search)
				return interpolationSearch(arr, search, start, position-1);
			if(arr[position]<search)
				return interpolationSearch(arr, search, position+1, end);
		}
		return -1;
	}

}
