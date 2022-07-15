package com.algorithms.search;

//The value n where the monotonically increasing function becomes positive.->f(n-1).. is negative, f(n+1).. is positive

public class UnBoundedBinarySearch {

	private static int f(int num) {
		return (num*num - 10*num -20); //function
	}

	public static void main(String[] args) {
		System.out.println("the value n where f() becomes positive first is "+findFirstPositive());

	}

	private static int findFirstPositive() {
		if(f(0)>0)
			return 0;
		int i=1;
		while(f(i)<=0) //doubling the index to find high
			i=i*2;
		return binarySearch(i/2,i);
		
	}

	private static int binarySearch(int low, int high) {
		if(high>=low) {
			int mid=(low+high)/2;
			if(f(mid)>0 && (mid==low||f(mid-1)<0))
				return mid;
			
			if(f(mid)<=0)
				return binarySearch(mid+1, high);
			else if(mid>0)
				return binarySearch(low, mid-1);
		}
		return -1;
	}

	
}


//o(log n)