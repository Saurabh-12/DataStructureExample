package com.saurabh.algo.sorting;

public class InsertionSortExample {

    public static void insertionSort(int array[])
    {
        int size = array.length;
        int temp, j;

        for (int i = 0; i < size; i++) {
            temp = array[i];

            for (j = i; j>0 && more(array[j-1], temp); j--) {
                array[j] = array[j-1];
            }
            array[j] = temp;
        }

    }

    public static boolean more(int i, int j){
        return i>j;
    }

    public static void main(String[] args) {

        int arr[] = {9,1,8,2,7,3,6,4,5};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }

        System.out.println("\n--------------");

    }
}