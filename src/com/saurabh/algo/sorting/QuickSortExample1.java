package com.saurabh.algo.sorting;

public class QuickSortExample1 {

public static void quickSort1(int left, int right, int arr[])
{
    //Base cond^n.
    if(right-left<=0)
        return;
    else{
        long pivot = arr[right];
        int partition = partitionIt(left,right,pivot,arr);
        quickSort1(left, partition-1, arr);
        quickSort1(partition+1, right, arr);
    }
}

private static int partitionIt(int left, int right, long pivot, int []arr) {
    int leftPtr = left-1;
    int rightPtr = right;

    while(true){

        while(arr[++leftPtr]<pivot)
        {
            //nop
        }
        while (rightPtr>0 && arr[--rightPtr]>pivot) {
            //nop
        }
        if(leftPtr>=rightPtr)
        {
            break;
        } else {
            swap(arr,leftPtr,rightPtr);
        }
    }
   swap(arr,leftPtr,right);
    return leftPtr;
}



private static void swap(int[] arr, int leftPtr, int rightPtr) {
    int temp = arr[leftPtr];
    arr[leftPtr] = arr[rightPtr];
    arr[rightPtr] = temp;
}

public static void main(String[] args) {
     int arrayE [] = {45,16,84,23,10,58,19,20,36,98};

     for (int i = 0; i < arrayE.length; i++) {
         System.out.print(arrayE[i]+" ");
     }
     System.out.println(" \n");

     quickSort1(0, arrayE.length-1, arrayE);
   
     for (int i = 0; i < arrayE.length; i++) {
         System.out.print(arrayE[i]+" ");
     }
     System.out.println(" ");

    }
}