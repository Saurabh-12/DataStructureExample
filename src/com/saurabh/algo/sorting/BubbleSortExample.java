package com.saurabh.algo.sorting;

public class BubbleSortExample {

    public static void bubbleSort(int arr[]){
        int size = arr.length;
        int temp;

        for (int i = 0; i <(size-1); i++) {

            for (int j = 0; j < (size-i-1); j++) {

                if(more(arr[j], arr[j+1]))
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }
            
        }
    }

    public static void modifiedBubbleSort(int arr[]){
        int size = arr.length;
        int temp, swap = 1;

        for (int i = 0; i <(size) && swap ==1; i++) {
            
            for (int j = 0; j < (size-1); j++) {
                swap = 0;
                
                if(more(arr[j], arr[j+1])){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap =1;
                }                
            }
        }
    }

public static void reviosion1BubbleSort(int arr[]){
    int out, in;
    int temp;
    int size = arr.length;
    for (out = (size-1); out > 1; out--) {

        for(in = 0; in<out;in++){
            if(arr[in]>arr[in+1]){
                temp = arr[in];
                arr[in] = arr[in+1];
                arr[in+1] = temp;
            }
        }
    }
}


    private static boolean more(int i, int j) {
        return i>j;
    }

    public static void main(String[] args) {
        int [] array = {5,1,2,4,3,7,6};
        //bubbleSort(array);
        //modifiedBubbleSort(array);
        reviosion1BubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        
    }

}