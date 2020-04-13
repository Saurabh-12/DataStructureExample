package com.saurabh.question.sorting;

/**
 * Given an array of 0s,1s and 2s, Write an algo to sort array so that 0s come
 * first followed by 1s and 2s. Also print the number of swaps.
 */

public class ArrayPartition012 {


public static int partition012(int []arr){ // Time complexity O(n)
    int swaps = 0;
    int i = 0;
    int left = 0;
    int right = arr.length-1;

    while(i<=right){

        if (arr[i] == 0) {
            swap(arr,i,left);
            i++;
            left++;    
            swaps++;
        }
        else if (arr[i] == 2) {
            swap(arr,i,right);
            swaps++;
            right--;
        }
        else{
            i++;
        }

    }

    return swaps;
}

private static void swap(int[] arr, int i, int right) {
    int temp = arr[i];
    arr[i] = arr[right];
    arr[right] = temp;
}

public static void main(String[] args) {

    int arr[] = {1,0,1,0,2,1,2,2,1,1,0,0,1,2,0};
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }
    System.out.println("\n");

    int SwapsCount = partition012(arr);

    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }
    System.out.println("\n No of saps: "+SwapsCount);
}

}