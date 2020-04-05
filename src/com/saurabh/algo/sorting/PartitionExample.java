package com.saurabh.algo.sorting;

public class PartitionExample {

    public static int partitionIt(int left, int right,long pivot, int []arr){
        int leftPtr = left-1; // left side partition
        int rightPtr = right+1; //right side partition

        while(true){
            while(leftPtr < right && arr[++leftPtr]<pivot){
                //nop
            }
            while(rightPtr>left && arr[--rightPtr]>pivot){
                //nop
            }

            if(leftPtr>=rightPtr){
                break;
            } else {
                swap(leftPtr,rightPtr, arr);
            }

        }
        return leftPtr;
    }
    
    
    private static void swap(int leftPtr, int rightPtr,int arr[]) {
        int temp;
        temp = arr[leftPtr];
        arr[leftPtr] = arr[rightPtr];
        arr[rightPtr] = temp;
    }

    public static void main(String[] args) {
        int arrayE [] = {45,16,84,23,10,58,19,20,36,98};

        int partitionValue = partitionIt(0, 9, 40, arrayE);
        System.out.println(" PartitionValue: "+partitionValue);

    }
}