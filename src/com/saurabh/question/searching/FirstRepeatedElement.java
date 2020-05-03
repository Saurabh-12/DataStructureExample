package com.saurabh.question.searching;

import java.util.HashSet;

/**
 * Given an array of integers, find the first repeating element in it. 
 * We need to find the element that occurs more than once and 
 * whose index of first occurrence is smallest.
 */

public class FirstRepeatedElement {  // First simle sloution using Brute force O(n^2)

    public static int firstRepeated(int []arr)
    {
        int i, j;
        int size = arr.length;

        for (i = 0; i < size; i++) {
            
            for (j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return 0;
    }

    //Use Hashing to solve this in O(n) time on average

    public static int firstRepeatMethod2(int []arr)
    {
        int min = -1;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(arr[i])){
                min = i;
                return min;
            }else {
                hashSet.add(arr[i]);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 56, 77, 1, 5, 6, 6, 6, 6, 6, 6, 7, 8, 10, 34, 56,20, 30};
        int firstRepeat = firstRepeated(arr);
        System.out.println("\n");
        System.out.println("First Repeated Element: "+firstRepeat);

        System.out.println("\n");
        int arr1[] = {10, 5, 3, 4, 5, 3, 4,6}; 
        int index = firstRepeatMethod2(arr1);
        System.out.println("First Repeated Element: "+arr1[index]);
    }
}