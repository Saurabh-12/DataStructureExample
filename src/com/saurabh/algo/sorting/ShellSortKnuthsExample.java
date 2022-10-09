package com.saurabh.algo.sorting;

public class ShellSortKnuthsExample {
	

public void shellSort(int arr[])
{
	int out, in,temp;
	int  size = arr.length;
	int h = 1;
	while(h<=size/3) 
		h = h*3+1;
	
	while(h>0)  {
		
		for (out = h; out < size; out++) {
			temp =  arr[out];
			in = out;
			
			while(in>h-1 && arr[in-h]>=temp) {
				arr[in] = arr[in-h];
				in -= h;
			}
			arr[in] = temp;
		}
		h = (h-1)/3;
	}
}
	
	public static void main(String[] args) {
		
		int testArr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			double n = Math.random() * 99;
			testArr[i] = (int) n;
		}
		
		//print
		for (int i = 0; i < testArr.length; i++) {
			System.out.print(" "+testArr[i]+" ");
		}
		System.out.println(" ");	
		
		new ShellSortKnuthsExample().shellSort(testArr);
		
		System.out.println(" --------------------------------------------");
		//print
		for (int i = 0; i < testArr.length; i++) {
			System.out.print(" "+testArr[i]+" ");
		}
		System.out.println(" ");	
		
		
	}

}