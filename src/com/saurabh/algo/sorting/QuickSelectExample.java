package com.saurabh.algo.sorting;

public class QuickSelectExample {

    public static void quickSelect(int arr[], int lower, int upper, int k){
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
        swap(arr,upper,lower);
        if(k<upper){
            quickSelect(arr, start, upper-1, k);
        }
        if(k>upper){
            quickSelect(arr, upper+1, stop, k);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int get(int arr[], int k){
        quickSelect(arr, 0, arr.length-1, k);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int arr[] = {3,4,2,1,6,5,7,8,10,9};
        System.out.println("value at index 6 is : "+get(arr, 6));        
    }
}