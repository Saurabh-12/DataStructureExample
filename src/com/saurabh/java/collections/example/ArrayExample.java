package com.saurabh.java.collections.example;

public class ArrayExample {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	
}
