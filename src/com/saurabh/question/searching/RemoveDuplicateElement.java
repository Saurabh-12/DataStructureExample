package com.saurabh.question.searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//Time Complexity O(nlogn)
public class RemoveDuplicateElement {

    public static int[] removeDuplicates(int[] array, int size) {
        int j = 0;
        Arrays.sort(array);
        for (int i = 1; i < size; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        int[] ret = Arrays.copyOf(array, j + 1);
        return ret;
    }

    // T. C. O(n^2)
    public static int[] removeDuplicateElements(int arr[]) {
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    // Replace duplicate element with last unique element
                    arr[j] = arr[end - 1];
                    end--;
                    j--;
                }
            }
        }
        // Copying only unique elements of my_array
        int[] whitelist = new int[end];
        for (int i = 0; i < end; i++) {
            whitelist[i] = arr[i];
        }
        // System.arraycopy(arr, 0, whitelist, 0, end);
        return whitelist;
    }

    // T.C. O(n)
    public static int[] removeDuplicatesMethod3(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        final int len = arr.length;
        // changed end to len
        for (int i = 0; i < len; i++) {
            set.add(arr[i]);
        }

        int[] whitelist = new int[set.size()];
        int i = 0;
        for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
            whitelist[i++] = it.next();
        }
        return whitelist;
    }

    public static void main(String[] args) {
        int[] first = { 1, 3, 5, 3, 9, 1, 30 };
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");
        }

        System.out.println("\n");
        int[] ret = removeDuplicates(first, first.length);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
        System.out.println("\n");

        int arr[] = { 10, 70, 30, 90, 20, 20, 30, 40, 70, 50 };// unsorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        int arr1[] = removeDuplicateElements(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");
 
         int arrs[] = { 1, 2, 3, 9, 20, 2, 3, 9, 20, 50 };// unsorted array
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println("\n");

        int arrs1[] = removeDuplicatesMethod3(arrs);
        for (int i = 0; i < arrs1.length; i++) {
            System.out.print(arrs1[i] + " ");
        }
        System.out.println("\n");

        // If you are allowed to use Java 8 streams:
        Arrays.stream(arr).distinct().toArray();
    }
}