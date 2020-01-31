package com.saurabh.algo.sorting;

public class MergeSortExample {

    public static void mergeSort(int arr[], int tempArr[], int lowerIndex, int upperIndex)
    {
        if(lowerIndex>=upperIndex){
            return;
        }

        int middleIndex = (lowerIndex+upperIndex)/2;
        mergeSort(arr, tempArr, lowerIndex, middleIndex);
        mergeSort(arr, tempArr, middleIndex+1, upperIndex);

        //Merge Code
        int lowerStart = lowerIndex;
        int lowerStop = middleIndex;
        int upperStart = middleIndex+1;
        int upperStop = upperIndex;
        int count = lowerIndex;

        while (lowerStart<=lowerStop && upperStart <= upperStop) {

            if(arr[lowerStart]<arr[upperStart]){
                tempArr[count++] = arr[lowerStart++];
            } else {
                tempArr[count++] = arr[upperStart ++];
            }
        }

        while (lowerStart<=lowerStop) {
            tempArr[count++] = arr[lowerStart++];
        }

        while (upperStart <= upperStop) {
            tempArr[count++] = arr[upperStart++];
        }

        for (int i = lowerIndex; i <= upperIndex; i++) {            
            arr[i] = tempArr[i];
        }

    }

    public static void main(String[] args) {
        
        int [] arr = {3,4,2,1,6,5,7,8,1,1};
        int size = arr.length;
        int [] tempArr = new int[size];

        //Sorting above aray using merge sort
        mergeSort(arr, tempArr, 0,(size-1));
        
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
        System.out.println("\n----------------------");
    }

}