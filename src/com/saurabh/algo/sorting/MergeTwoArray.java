package com.saurabh.algo.sorting;

class MergeTwoArray
{
    public static void main(String[] args) {

        int arrayA[] = {23, 47,81,95};
        int arrayB[] = {7,14,39,55,62,74};
        int arrayC[] = new int[10];

        merge(arrayA,4, arrayB,6,arrayC);

        for (int i = 0; i < arrayC.length; i++) {
           System.out.print(arrayC[i]+" ");
        }
        System.out.println("");
        

    }


    public static void merge(int[] arrA, int sizeA, int[] arrB, int sizeB, int[] arrC) {
        int a = 0;
        int b = 0;
        int c = 0;

        //Neither array empty
        while (a<sizeA && b<sizeB) {
         if(arrA[a]<arrB[b]){
             arrC[c++] = arrA[a++];             
         }   else {
             arrC[c++] = arrB[b++];
         }
        }

        //Array B is empty  but A is not
        while(a<sizeA){
            arrC[c++] = arrA[a++];
        }

        //Array A is  empty but not B
        while(b<sizeB){
            arrC[c++] = arrB[b++];
        }
    }

}