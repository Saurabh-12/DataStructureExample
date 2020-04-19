package com.saurabh.question.sorting;

public class SeprateEvenOddFromArray {

public static int[] seprateEvenOddMethod1(int arr[]) {
    int size = arr.length;
    int start = 0, end = size- 1  ;
    int arr2[] = new int[size];

    for (int i = 0; i < size; i++) {
        if(arr[i]%2 == 0){
            arr2[start] =arr[i];
            start++;
        }else if(arr[i]%2!=0){
            arr2[end] = arr[i];
            end--;
        }
    }
    return arr2;
}

public static void seprateEvenOddMethod2(int arr[]){
    int size = arr.length;
    int left = 0, right = size-1;

    while (left<right) {
       if(arr[left] %2 == 0){
           left++;
       } else if(arr[right]%2 ==1){
           right--;
       }else{
           swap(arr,left,right);
           left++;
           right--;
       }
    }
}

private static void swap(int[] arr, int left, int right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
}

public static void main(String[] args) {
        
        int arr[] = {10,3,2,7,8,9,11,4,16,13,6};
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

       // int arr2[] = seprateEvenOddMethod1(arr);
        seprateEvenOddMethod2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n");
    }
}