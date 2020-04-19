package com.saurabh.question.sorting;

import java.util.HashMap;

/**
 * Given 2 Array, Sort 1st Array according to the order defined in 2nd Array
 */

public class Sort1stArrayBasedOn2ndArrayOrder {

    public static void Sort1stArrayBasedOn2ndArray(int[] arr1, int arr2[]) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        int value;
        int size1 = arr1.length;
        int size2 = arr2.length;

        for (int i = 0; i < size1; i++) {
            if (ht.containsKey(arr1[i])) {
                value = ht.get(arr1[i]);
                ht.put(arr1[i], value + 1);
            } else {
                ht.put(arr1[i], 1);
            }
        }
        System.out.println("\n");

        for (int j = 0; j < size2; j++) {
            if (ht.containsKey(arr2[j])) {
                value = ht.get(arr2[j]);
                for (int k = 0; k < value; k++) {
                    System.out.print(arr2[j]+" ");
                }
                ht.remove(arr2[j]);
            }
        }

        for (int i = 0; i < size1; i++) {
            if (ht.containsKey(arr1[i])) {
                value = ht.get(arr1[i]);
                for (int k = 0; k < value; k++) {
                    System.out.print(arr1[i]+" ");
                }
                ht.remove(arr1[i]);
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");

        int arr2[] = { 2, 1, 8, 3 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
        System.out.println("\n");

        Sort1stArrayBasedOn2ndArray(arr, arr2);
    }
}