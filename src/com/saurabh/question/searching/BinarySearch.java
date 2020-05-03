package com.saurabh.question.searching;

public class BinarySearch {

  // Binary Search Algorithm - Iterative Way
    public static int Binarysearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int result = -1;// no match

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == value) {
                result = mid;
                return result;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\n");
        int arr[] = { 1, 3, 5, 7, 9, 25, 30 };
        int index = Binarysearch(arr, 7);
        System.out.println("Value 7 is at index: " + index);
        System.out.println("\n");
    }
}