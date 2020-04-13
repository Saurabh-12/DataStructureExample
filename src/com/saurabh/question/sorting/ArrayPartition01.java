package com.saurabh.question.sorting;

/**
 * Given an array of 0s and 1s, Write an algo to sort array so that 0s come
 * first followed by 1s. Also print the number of swaps.
 */

public class ArrayPartition01 {

    //Time complexity looks like quadratic due to loop inside loop.
    //But Actually it is linear O(n). 
    //Because inside loop either increment or decrement a atime
    public static int partition01(int arr[]) {
        int swaps = 0;
        int size = arr.length;
        int left = 0;
        int right = size - 1;
        while (left < right) {

            while (arr[left] == 0) {
                left++;
            }
            while (arr[right] == 1) {
                right--;
            }

            if (left < right) {
                swap(arr, left, right);
                swaps++;
            }
        }

        return swaps;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        System.out.println("\n");
        int arr[] = { 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        int swapsCount = partition01(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n Swap count: " + swapsCount);

    }
}