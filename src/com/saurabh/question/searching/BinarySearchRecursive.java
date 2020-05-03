package com.saurabh.question.searching;

public class BinarySearchRecursive {

    public static int binarySearchRecur(int[] arr, int start, int end, int value) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            if (value < arr[mid]) {
                return binarySearchRecur(arr, start, mid, value);
            } else if (value > arr[mid]) {
                return binarySearchRecur(arr, mid + 1, end, value);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("\n");
        int arr[] = { 1, 3, 5, 7, 9, 25, 30 };
        int index = binarySearchRecur(arr, 0, arr.length, 9);
        System.out.println("Value 9 is at index: " + index);
        System.out.println("\n");
    }
}