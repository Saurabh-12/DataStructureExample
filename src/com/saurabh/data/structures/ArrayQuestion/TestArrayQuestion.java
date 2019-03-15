package com.saurabh.data.structures.ArrayQuestion;

public class TestArrayQuestion {
	
	public static void main(String[] args) {
		
		ArrayQuestion arrQuestionObj = new ArrayQuestion();
		
		int arr [] = {10,20,30,40,50,60};
		arrQuestionObj.printArray(arr);
		
		arrQuestionObj.rotateArrayByKPos(arr, 6, 2);
		arrQuestionObj.printArray(arr);
		
		
	}

}
