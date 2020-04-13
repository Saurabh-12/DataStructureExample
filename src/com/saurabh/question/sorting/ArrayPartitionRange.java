package com.saurabh.question.sorting;

/**
 * Given an Array of integer and a range. Sort Array such a way that Value
 * smaller of range come left followed by value under range and value greater
 * than range come right of range.
 */

public class ArrayPartitionRange {

    public static void rangePartition(int[] arr, int lowerRange, int higherRange) {
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (i <= end) {
            if (arr[i] < lowerRange) {
                swap(arr, i, start);
                i += 1;
                start += 1;
            } else if (arr[i] > higherRange) {
                swap(arr, i, end);
                end -= 1;
            } else {
                i += 1;
            }
        }
    }

    private static void swap(int[] arr, int i, int end) {
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        rangePartition(arr, 9, 12);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

    }
}