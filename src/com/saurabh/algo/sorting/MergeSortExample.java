package com.saurabh.algo.sorting;

public class MergeSortExample {

    public static void mergeSort(int arr[], int tempArr[], int lowerIndex, int upperIndex) {
        if (lowerIndex >= upperIndex) {
            return;
        }

        int middleIndex = (lowerIndex + upperIndex) / 2;
        mergeSort(arr, tempArr, lowerIndex, middleIndex);
        mergeSort(arr, tempArr, middleIndex + 1, upperIndex);

        // Merge Code
        int lowerStart = lowerIndex;
        int lowerStop = middleIndex;
        int upperStart = middleIndex + 1;
        int upperStop = upperIndex;
        int count = lowerIndex;

        while (lowerStart <= lowerStop && upperStart <= upperStop) {

            if (arr[lowerStart] < arr[upperStart]) {
                tempArr[count++] = arr[lowerStart++];
            } else {
                tempArr[count++] = arr[upperStart++];
            }
        }

        while (lowerStart <= lowerStop) {
            tempArr[count++] = arr[lowerStart++];
        }

        while (upperStart <= upperStop) {
            tempArr[count++] = arr[upperStart++];
        }

        for (int i = lowerIndex; i <= upperIndex; i++) {
            arr[i] = tempArr[i];
        }

    }

    private static void MergeSort2(int[] input, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            MergeSort2(input, start, mid);
            MergeSort2(input, mid + 1, end);
        }

        int i = 0, first = start, last = mid + 1;
        int temp[] = new int[end - start + 1];

        while (first <= mid && last <= end) {
            temp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }

        while (first <= mid) {
            temp[i++] = input[first++];
        }
        while (last <= end) {
            temp[i++] = input[last++];
        }

        i = 0;
        while (start <= end) {
            input[start++] = temp[i++];
        }

    }

    int[] theArray;

    public void mergeSort3(int[] arr) {
        theArray = new int[arr.length];
        recMergeSort(arr, 0, arr.length - 1);

    }

    public void recMergeSort(int[] arr, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) // if range is 1,
            return; // no use sorting
        else { // find midpoint
            int mid = (lowerBound + upperBound) / 2;
            // sort low half
            recMergeSort(arr, lowerBound, mid);
            // sort high half
            recMergeSort(arr, mid + 1, upperBound);
            // merge them
            merge(arr, lowerBound, upperBound);
        } // end else
        // end recMergeSort(
    }

    private void merge(int[] arr, int lowerIndex, int upperIndex) {
        // Merge Code
        int middleIndex = (lowerIndex+upperIndex)/2;
        int lowerStart = lowerIndex;
        int lowerStop = middleIndex;
        int upperStart = middleIndex + 1;
        int upperStop = upperIndex;
        int count = lowerIndex;

        while (lowerStart <= lowerStop && upperStart <= upperStop) {

            if (arr[lowerStart] < arr[upperStart]) {
                theArray[count++] = arr[lowerStart++];
            } else {
                theArray[count++] = arr[upperStart++];
            }
        }

        while (lowerStart <= lowerStop) {
            theArray[count++] = arr[lowerStart++];
        }

        while (upperStart <= upperStop) {
            theArray[count++] = arr[upperStart++];
        }

        for (int i = lowerIndex; i <= upperIndex; i++) {
            arr[i] = theArray[i];
        }
    } // end merge

    public static void main(String[] args) {

        int[] arr = { 3, 4, 2, 1, 6, 5, 7, 8, 1, 1 };
        int size = arr.length;
        int[] tempArr = new int[size];

        // Sorting above aray using merge sort
        // mergeSort(arr, tempArr, 0,(size-1));
        //MergeSort2(arr, 0, size - 1);

        int[] arr1 = { 64, 21, 33, 70, 12, 85, 3, 99, 0, 108, 36 };
        System.out.println("Unsorted Array elements");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n----------------------");

        new MergeSortExample().mergeSort3(arr1);

        System.out.println("After Sorting array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n----------------------");
    }

}