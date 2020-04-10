package com.saurabh.algo.sorting;

//demonstrates quick sort with median-of-three partitionin

public class QuickSortExample2 {

    public static void quickSort2(int left, int right, int[] arr) {
        int size = right - left + 1;
        if (size <= 3) // manual sort if small
            manualSort(left, right, arr);
        else // quicksort if large
        {
            long median = medianOf3(left, right, arr);
            int partition = partitionIt(left, right, median, arr);
            quickSort2(left, partition - 1, arr);
            quickSort2(partition + 1, right, arr);
        }
    } // end recQuickSort(

    public static long medianOf3(int left, int right, int[] arr) {
        int center = (left + right) / 2;
        // order left & center
        if (arr[left] > arr[center])
            swap(left, center, arr);
        // order left & right
        if (arr[left] > arr[right])
            swap(left, right, arr);
        // order center & right
        if (arr[center] > arr[right])
            swap(center, right, arr);

        swap(center, right - 1, arr); // put pivot on right
        return arr[right - 1]; // return median value
    } // end medianOf3()

    public static void swap(int leftPtr, int rightPtr, int[] arr) // swap two elements
    {
        int temp = arr[leftPtr]; // A into temp
        arr[leftPtr] = arr[rightPtr]; // B into A
        arr[rightPtr] = temp; // temp into B
    } // end swap(

    public static int partitionIt(int left, int right, long pivot, int arr[]) {
        int leftPtr = left; // right of first elem
        int rightPtr = right - 1; // left of pivot

        while (true) {
            while (arr[++leftPtr] < pivot) // find bigger
                ; // (nop)
            while (arr[--rightPtr] > pivot) // find smaller
                ; // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
                break; // partition done
            else // not crossed, so
                swap(leftPtr, rightPtr, arr); // swap elements
        } // end while(true)
        swap(leftPtr, right - 1, arr); // restore pivot
        return leftPtr; // return pivot location
    } // end partitionIt()

    public static void manualSort(int left, int right, int[] arr) {
        int size = arr.length;
        if (size <= 1)
            return; // no sort necessary
        if (size == 2) { // 2-sort left and right
            if (arr[left] > arr[right])
                swap(left, right, arr);
            return;
        } else // size is 3
        { // 3-sort left, center, & right
            if (arr[left] > arr[right - 1])
                swap(left, right - 1, arr); // left, center
            if (arr[left] > arr[right])
                swap(left, right, arr); // left, right
            if (arr[right - 1] > arr[right])
                swap(right - 1, right, arr); // center, right
        }
    } // end manualSort()

    public static void main(String[] args) {
 
        int[] arr = new int[13]; // create the array
        for (int j = 0; j < 13; j++) // fill array with
        { // random numbers
            int n = (int) (java.lang.Math.random() * 99);
            arr[j] = n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        quickSort2(0, arr.length-2, arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

    }
}