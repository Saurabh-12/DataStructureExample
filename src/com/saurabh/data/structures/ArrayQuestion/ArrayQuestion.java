package com.saurabh.data.structures.ArrayQuestion;

public class ArrayQuestion {
	
	
	// Q. 1. Sum of array
	public int sumOfArray(int arr[])
	{
		int sum = 0;
		
		if(arr != null && arr.length>0) {
			int size = arr.length;
			
			for (int i = 0; i < size; i++) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	
	
	//Q. 2. Sequential Search or Linear Search 
	
	public int sequentialSearch(int arr [], int value) 
	{
		if(arr != null && arr.length>0)
		{
			int size = arr.length;
			
			for (int i = 0; i < size; i++) 
			{
				if(value == arr[i])
				{
					return i;
				}
			}
		}
		
		
		return -1;
	}
	
	// Q. 3. Binary Search in a sorted array 
	public int binarySearch(int arr[], int value)
	{
		if(arr != null && arr.length>0)
		{
			int size = arr.length;
			int low = 0;
			int high = size-1;
			int mid;
			while(low<=high)
			{
				mid = low +(high-low)/2; //to avoid the overflow
				if(arr[mid] == value)
				{
					return mid;
					
				}
				else
				{
					if(arr[mid]<value)
					{
						low = mid+1;
					}
					else
					{
						high = mid -1;
						
					}
				}
			}
		}
		return -1;
	}


//Q. 4. Recursive Binary search
	public int recursiveBinarySerch(int arr[], int start, int end, int key)
	{
		if(start<end)
		{
			int mid = start+(end-start)/2;
			
			if(key < arr[mid])
			{
				return recursiveBinarySerch(arr, start, mid, key);
			}
			else if(key > arr[mid])
			{
				return recursiveBinarySerch(arr, mid+1, end, key);
			}
			else
			{
				return mid;
			}
			
		}
		
		return -1;
	}

// Q. 5. Rotate an array by K positions
	public void rotateArrayByKPos(int arr[], int array_size, int k_position)
	{
		for(int i = 0; i<k_position; i++)
		{
			rotateArrayByOne(arr, array_size);
		}
	}
	
	public void rotateArrayByOne(int arr[], int size)
	{
		int i = 0;
		int temp = arr[0];
		
		for(i = 0;i<size-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	

public void printArray(int arr[])
{
	if(arr != null && arr.length>0)
	{
		int size = arr.length;
		System.out.print("[ ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print(" ]");
		System.out.println("\n");
	}
}


}
