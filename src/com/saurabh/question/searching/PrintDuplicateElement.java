package com.saurabh.question.searching;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Find Duplicate Elements in an Array
 */

public class PrintDuplicateElement {

    // Solution 1 Brute force O(n^2)
    public static void printDuplicateMethod1(int arr[]) {
        int i, j;
        int size = arr.length;

        System.out.print(" \nRepeating elements are: ");
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(+arr[i] + " ");
                }
            }
        }
        System.out.println("\n");
    }

    //solution 2 
    public static void printDuplicateMethod2(int arr[]) {
        Arrays.sort(arr);
        System.out.print(" \nRepeating elements are: ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("\n");
    }
    
    //Solution 3
    public static void printDuplicateMethod3(int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int size = arr.length;

        System.out.print(" \nRepeating elements are: ");
        for (int i = 0; i < size; i++) {
            if (hs.contains(arr[i])) {
                System.out.print(" " + arr[i]);
            } else {
                hs.add(arr[i]);
            }
        }
        System.out.println("\n");
    }

    //Solution 4
    public static void printDuplicateMethod4(int []arr)
    {

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 3, 9, 1, 30 };

        printDuplicateMethod1(arr);
        printDuplicateMethod2(arr);
        printDuplicateMethod3(arr);

        
    }
}