package com.saurabh.algo.sorting;
// demonstrates quick sort; uses insertion sort for cleanup
public class QuickSortExample3 {

   public static void quickSort3(int left, int right, int []arr)
      {
      int size = right-left+1 ;//arr.length;
      if(size < 10)                   // insertion sort if small
         insertionSort(left, right, arr);
      else                            // quicksort if large
         {
         long median = medianOf3(left, right,arr);
         int partition = partitionIt(left, right, median, arr);
         quickSort3(left, partition-1,arr);
         quickSort3(partition+1, right, arr);
         }
      }  // end recQuickSort()

    public static long medianOf3(int left, int right, int[] arr) {
        int center = (left + right) / 2;
        // order left & center
        if (arr[left] > arr[center])
            swap(left, center, arr);
        // order left & right
        if (arr[left] > arr[right])
            swap(left, right, arr);
        // order center & right
        if (arr[center] > arr[right])
            swap(center, right, arr);

        swap(center, right - 1, arr); // put pivot on right
        return arr[right - 1]; // return median value
    } // end medianOf3()

    public static void swap(int leftPtr, int rightPtr, int[] arr) // swap two elements
    {
        int temp = arr[leftPtr]; // A into temp
        arr[leftPtr] = arr[rightPtr]; // B into A
        arr[rightPtr] = temp; // temp into B
    } // end swap(

    public static int partitionIt(int left, int right, long pivot, int arr[]) {
        int leftPtr = left; // right of first elem
        int rightPtr = right - 1; // left of pivot

        while (true) {
            while (arr[++leftPtr] < pivot) // find bigger
                ; // (nop)
            while (arr[--rightPtr] > pivot) // find smaller
                ; // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
                break; // partition done
            else // not crossed, so
                swap(leftPtr, rightPtr, arr); // swap elements
        } // end while(true)
        swap(leftPtr, right - 1, arr); // restore pivot
        return leftPtr; // return pivot location
    } // end partitionIt()
                                       // insertion sort
   public static void insertionSort(int left, int right, int []arr)
      {
      int in, out;
                                       //  sorted on left of out
      for(out=left+1; out<=right; out++)
         {
         int temp = arr[out];    // remove marked item
         in = out;                     // start shifts at out
                                       // until one is smaller,
         while(in>left && arr[in-1] >= temp)
            {
            arr[in] = arr[in-1]; // shift item to right
            --in;                      // go left one position
            }
         arr[in] = temp;          // insert marked item
         }  // end for
      }  // end insertionSort()

    public static void main(String[] args) {
       int maxSize = 16;             // array size
      int[]arr = new int[maxSize];  // create the array

      for(int j=0; j<maxSize; j++)  // fill array with
         {                          // random numbers
         int n = (int)(java.lang.Math.random()*99);
         arr[j] = n;
         }

         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println("\n");

         quickSort3(0, arr.length-1, arr);

         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println("\n");


        

    }
}