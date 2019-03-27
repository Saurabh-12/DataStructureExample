package com.saurabh.data.structures.ArrayQuestion;

import java.util.Arrays;
import java.util.HashMap;

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
	
	// Q. 6. Sort Array 1 to N. It contains unique element from 1 to N. 
// int arr [] = {8,5,7,9,3,1,4,10,2,6}
public void  sortArray1toN(int [] arr, int size)
{
	int curr, next, value;
	for(int i = 0; i < size; i++)
	{
		curr = i;
		value = -1;
		// Swap to move element in proper position
		while(curr >=0  && curr<size && arr[curr] != curr+1)
		{
			next = arr[curr];
			arr[curr] = value;
			value = next;
			curr = next - 1;
		}
	}
}

//  Q. 6. 2nd Method Swapping the element
// int arr [] = {8,5,7,9,3,1,4,10,2,6}
public void sortArray1ToN(int arr [], int size)
{
	int temp;
	for(int i = 0 ; i <size; i++)
	{
		while(arr[i] != i+1 && arr[i]>1 )
		{
			temp = arr[i];
			arr[i] = arr[temp-1];
			arr[temp -1]  = temp;
		}
	}
}

// Q.7. Index Array :- Given array of size N, containing elements from 0 to N-1. 
// All values from 0 to N-1 are present in array and if they are not there than put -1
// i/p = [8, -1,6,1,9,3,2,7,4,-1]
//o/p = [-1,1,2,3,4,-1,6,7,8,9]
public void indexAray(int [] arr, int size)
{
	int temp;
	for(int i = 0; i<size; i++)
	{
		while(arr[i] != -1 &&  arr[i] != i)
		{
			//Swap
			temp = arr[i];
			arr[i] = arr[temp];
			arr[temp] = temp;
		}
	}
}

// Q. 8. Maximum and Minimum Array for sorted array
// I/P = { 1,2,3,4,5,6,7}
//o/p = {7,1,6,2,5,3,4}
public void MaxMinArray(int arr [], int size)
{
	int auxArr[] = new int [size];
		
	for (int i = 0; i < size; i++) {
		auxArr[i] = arr[i];
	}
	
	int start = 0;
	int stop = size-1;
	
	for (int i = 0; i < size; i++) {
		
		if (i%2 ==0)
		{
			arr[i] = auxArr[stop];
			stop--;
		}
		else {
			arr[i] = auxArr[start];
			start++;
			
		}
	}
}

// Q. 9. Given an unsorted array, find smallest positive number missing  in the array. 
// i/p = {8,5,6,1,9,11,2, 7, 4,10}
//o/p = {3}
public  int smallestPositiveMissingNumber(int [] arr, int size)
{
	//O[n^2)
	int found;
	for (int i = 1; i < size+1; i++) {
		found = 0;
		
		for (int j = 0; j < size; j++) {
	
			if(arr[j] == i)
			{
				found = 1;
				break;
			}
		}
		if(found ==0) 
		{
			return i;
		}
	}
	return -1;
}
// Second Method  using Hash table
public int smallestPositiveMissingNumber2(int arr [], int size)
{
	HashMap<Integer, Integer>hs = new HashMap<>();
	
	for (int i = 0; i < size; i++) {
		hs.put(arr[i], 1);
	}
	
	for (int i = 1; i <size+1; i++) {
		if(hs.containsKey(i)==false)
		{
			return i;
		}
	}
	
	return -1;
}
//Third Method  =  rearranging the elements. O(n)
public int smallestPositiveMissingNumber3(int arr[], int size)
{
	int temp;
	for (int i = 0; i <size; i++) {

		while(arr[i] != i+1 && arr[i]>0 && arr[i]<= size)
		{
			temp = arr[i];
			arr[i] = arr[temp-1];
			arr[temp-1] = temp;
		}
	}
	
	for(int i = 0; i<size;i++)
	{
		if(arr[i]!= i+1)
		{
			return i+1;
		}
	}

	return -1;
}

//Fourth Method : Using Auxiliary array
public int smallestPositiveMissingNumber4(int []arr, int size)
{
	int []auxArr = new int[size];
	Arrays.fill(auxArr, -1);
	
	for(int i = 0; i<size; i++)
	{
		if(arr[i]>0 && arr[i]<=size)
		{
			auxArr[arr[i]-1] = arr[i];
		}
	}
	printArray(auxArr);
	
	for(int i = 0; i<size; i++)
	{
		if(auxArr[i] != i+1)
		{
			return i+1;
		}
	}
	return -1;
}

//Q. 10.  Array Wave form :- Arrange elements in wave form such that odd element are lesser than its
// neighbouring even number
// i/p = {8,1,2,3,4,5,6,4,2}
//o/p = {}

public void waveArray(int [] arr, int size)
{
	//odd elements are lesser then even element
	for(int i = 1; i <size; i+=2)
	{
		if((i-1)>=0 && arr[i]>arr[i-1]) {
			swap(arr, i, i-1);
		}
		if((i+1)<size && arr[i]>arr[i+1])
		{
			swap(arr, i, i+1);
		}
	}
}

private void swap(int[] arr, int i, int j) {
	int temp;
	temp = arr[i];
	arr[i] = arr[j];
	arr[j] =temp;
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
