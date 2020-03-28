package com.saurabh.algo.sorting;

public class SelectionSortExample {


    public static void selectionSort(int arr[]){
        int size = arr.length;
        int i, j, max, temp;

        for(i = 0; i<(size-1);i++){
            max = 0;
            for (j = 1; j < (size-1-i); j++) {

                if(more(arr[j],arr[max])){
                    max = j;
                }
            }

            temp = arr[size-1-i];
            arr[size-1-i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void selectionSortDesending(int arr[])
    {
        int size = arr.length;
        int i, j, temp, min;

        for(i = 0; i<(size);i++){
            min = i;

            for(j = i+1; j<size;j++){

                if(more(arr[j],arr[min])){
                    min = j;
                }
            }    
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;        
        }
    }

public static void revision1SelectionSot(int []arr){
    int size = arr.length;
    int min;
    int temp;

    for(int i = 0; i<size; i++){
        min = i;

        for (int j = i+1; j < size; j++) {
            if(arr[j]>arr[min]){
                min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}

    public static boolean more(int i, int j){
        return i>j;
    }
    
    public static void main(String[] args) {

        int arr[] = {9,1,8,2,7,3,6,4,5};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
        System.out.println("\n--------------");
        
        int arr2[] = {9,1,8,2,7,3,6,4,5};
        selectionSortDesending(arr2);
        //revision1SelectionSot(arr2);
        for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]+" ");
        }
        System.out.println("\n--------------");
    }
}