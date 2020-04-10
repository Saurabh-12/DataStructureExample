package com.saurabh.algo.sorting;

public class QuickSortExample {

    private static void quickSort(int []arr, int lower, int upper){
        if (upper<=lower) {
            return;
        }

        int pivot = arr[lower];
        int start = lower;
        int stop = upper;

        while (lower<upper) {
            while (arr[lower]<=pivot && lower<upper) {
                lower++;
            }
            while (arr[upper]>pivot && lower<=upper) {
                upper--;
            }
            if(lower<upper){
                swap(arr,upper,lower);
            }
        }

        swap(arr,upper,start);
        quickSort(arr, start, upper-1);
        quickSort(arr, upper+1, stop);
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,2,1,6,5,7,8,1,1};
        int arrayE [] = {45,16,84,23,10,58,19,20,36,98};
        quickSort(arrayE, 0, arrayE.length-1);
        for (int i = 0; i < arrayE.length; i++) {
            System.out.print(arrayE[i]+" ");
        }
        System.out.println("\n      ");
        
    }

}