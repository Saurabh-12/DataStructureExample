package com.saurabh.question.sorting;

import java.util.Arrays;

/**
 * Given an Array of positive number.
 * In each reduction operation pick a smallest number from given array
 * and all the elements are substracted by that value.
 * print the number of elements left after each reduction.
 * i/p = {5,1,1,1,2,3,5}
 * o/p
 * 4 c/r to {4,1,2,4}
 * 3 c/r to {3,1,3}
 * 2 c/r to {2,2}
 * 0 c/r to {0} 
 */

public class ArrayReduction {

    public static void reduceArray(int arr[]){  // Time complexity: O(nlogn)
                                                //requred for array sorting
        int size = arr.length;
        int temp = 1;
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-temp>0)
            {
                System.out.println(size-i);
                temp = arr[i];
                count++;
            }
        }
        System.out.println("Total number of reduction: "+count);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 1, 1, 2, 3, 5 };
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        reduceArray(arr);
 
    }
}