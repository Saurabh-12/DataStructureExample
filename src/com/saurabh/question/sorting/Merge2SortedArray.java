package com.saurabh.question.sorting;

public class Merge2SortedArray {

    public static int[] merge2Array(int arr1[], int arr2[]) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int resultArray[] = new int[size1+size2];
        int i=0,j=0,k=0;

        while (i<size1 && j<size2) {
            if(arr1[i]<arr2[j]){
                resultArray[k] = arr1[i];
                k++;
                i++;
            }else {
                resultArray[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i<size1) {
            resultArray[k++] = arr1[i++];
        }

        while (j<size2) {
            resultArray[k++] = arr2[j++];
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 9, 10, 15, 20 };
        int arr2[] = { 2, 3, 8, 13 };
        int result[] = merge2Array(arr1, arr2);
       
        System.out.println("\n");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println("\n");
        
    }
}