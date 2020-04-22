package com.saurabh.question.searching;

public class LinearSearch {

public static int linearSearch(int arr[], int value){
    int result = -1;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == value)
        {
            result = i;
        }
    }
    return result;
}


   public static void main(String[] args) {

    int arr[] = {12,3,7,5,18,6,9,4};
    System.out.println("\n");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println("\n");

    int findValue = linearSearch(arr, 6);
    System.out.println("Value: 6 at index: "+findValue);
       
   } 
}