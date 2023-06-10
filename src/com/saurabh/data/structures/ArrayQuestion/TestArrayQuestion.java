package com.saurabh.data.structures.ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;
import javax.xml.stream.events.EntityDeclaration;

public class TestArrayQuestion {
	
	public static void main(String[] args) {
		
		ArrayQuestion arrQuestionObj = new ArrayQuestion();
		
		int arr [] = {10,20,30,40,50,60};
		arrQuestionObj.printArray(arr);
		arrQuestionObj.rotateArrayByKPos(arr, arr.length, 2);
		arrQuestionObj.printArray(arr);
		
		System.out.println("-------------------------------------");
		int arr2 [] = {8,5,7,9,3,1,4,10,2,6};
		arrQuestionObj.printArray(arr2);
		arrQuestionObj.sortArray1toN(arr2, arr2.length);
		arrQuestionObj.printArray(arr2);
		
		System.out.println("-------------------------------------");
		int arr3 [] = {8, -1,6,1,9,3,2,7,4,-1};
		arrQuestionObj.printArray(arr3);
		arrQuestionObj.indexAray(arr3, arr3.length);
		arrQuestionObj.printArray(arr3);
		
		System.out.println("-------------------------------------");
		int arr4 [] = { 1,2,3,4,5,6,7};
		arrQuestionObj.printArray(arr4);
		arrQuestionObj.MaxMinArray(arr4, arr4.length);
		arrQuestionObj.printArray(arr4);
		
		System.out.println("-------------------------------------");
		int arr5 [] = {8,5,6,1,9,11,2, 7, 4,10};
		arrQuestionObj.printArray(arr5);
		int missingValue = arrQuestionObj.smallestPositiveMissingNumber4(arr5, arr5.length);
		System.out.println("missingValue "+missingValue);
		arrQuestionObj.printArray(arr5);
		
		System.out.println("---------------ArrayWave----------------------");
		int arr6 [] = {8,1,2,3,4,5,6,4,2};
		arrQuestionObj.printArray(arr6);
		int arrs [] = arrQuestionObj.waveArray(arr6, arr6.length);
		arrQuestionObj.printArray(arrs);
		
		System.out.println("----------ArrayWave using Quicksort---------------------------");
		int arr7 [] = {8,1,2,3,4,5,6,4,2};
		QuickSort quicksort = new QuickSort();
		quicksort.sort(arr7, 0, arr7.length-1);
		arrQuestionObj.printArray(arr7);
		 int [] arr8 = {8,1,2,3,4,5,6,4,2};
		int arrsN [] = arrQuestionObj.waveArrayUsingQuickSort(arr8, arr8.length);
		arrQuestionObj.printArray(arrsN);
		
		//Find repeated element count in Array
		System.out.println("------------------- Repeated Element Count in Array------------------");
		int arr9[] = {1,3,5,2,4,1,3,5,4,3,1,3,5,4,1,2,3,1,3,1,2,1,5,7,6,1};
		int arr9Size = arr9.length;
		HashMap<Integer,Integer>repeation = arrQuestionObj.findRepeatingElementInArray(arr9, arr9Size);
		System.out.println("Below is the repeation frequency");
		for (Map.Entry<Integer,Integer>entry : repeation.entrySet()) {
			System.out.println(entry.getKey() + " --> "+entry.getValue());
		}

		// Find max Repeated element key and values
		System.out.println("----------------Print max repeated Element in Array------------------");
		arrQuestionObj.printMaxRepeatedElement(repeation);

		// find 2 or 3 or 5 maximum repeated element
		// if 2 then in above example 1 -->8 and 3 -->6
		System.out.println("----------------Print requested number of max repeated Element in Array------------------");
		arrQuestionObj.printRequestedNumberOfRepeatingElementinArray(repeation, 3);



	}

}
