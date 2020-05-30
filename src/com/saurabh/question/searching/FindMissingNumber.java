package com.saurabh.question.searching;

import java.util.HashSet;

/**
 * In  given list of n-1 element, which are in the range of 1 to n.
 * there is no duplicates in the array. One of the integer is missing
 * find missing element
 */

public class FindMissingNumber {


    //  Brute Force Time Complexity O(n^2) S.C. O(1)
    public static int findMissingNumber(int[] arr) {
        int i, j, found = 0;
        int size = arr.length;

        for (i = 1; i <= size; i++) {
            found = 0;
            for (j = 0; j < size; j++) {
                if (arr[j] == i) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
// 2nd Method Sort Array O(nlogn) and single scan O(n)
//Time Complexity O(nlogn)

//3rd Method Using HashTable keep track of the elements.
//Find missing element in one scan
// HashTable O(1) One Scan O(n) Total T.C. O(n)

//4th Method Counting, We know the range of the input so counting will works. T.C. O(n)+O(n) = O(n)
public static int findMissingNumberByCounting(int []arr)
{
    int missedNum = -1;
    int arrSize = arr.length;
    int countArr[] = new int[arrSize+1];
    for(int i = 0; i<countArr.length;i++ ){
        countArr[i] = i+1;
    }

    for (int i = 0; i < countArr.length; i++) {
        if (countArr[i]==arr[i]) {
        } else {
           missedNum = countArr[i];
           return missedNum;
        }
    }

    return missedNum;
}
//5th Method Summation formula: find the sum from 1 to n. Substract the value stored in array
//and you have missing number T.C. O(n), S.C. O(n)

//6th Method XOR approach to find the sum of n number from 1 to N. XOR the values stored in array.
//You will find mising number T.C. O(n), S.C. O(1)
public static int findMissingNumberUsingXOR(int arr[]){
    int xorSum = 0;
    //Get the xor of all the number from 1 to n (array range = array lengthy+1)
    for (int i = 1; i <= arr.length+1; i++) {
        xorSum ^=i;
    }

    //loop through the array and get xor of elements
    for (int i = 0; i < arr.length; i++) {
        xorSum ^=arr[i];
    }
    return xorSum;
}

//7th Method: Using Set 
public static int findMissingNumberUsingSet(int arr[]){
    int result = -1;
    
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        hs.add(arr[i]);
    }

    for (int i = 1; i <= arr.length+1; i++) {
        if(hs.contains(i) == false)
        {
            result = i;
            return result;
        }
    }
    return result;
} 

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 6, 8, 7 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        int missing = findMissingNumber(arr);
        System.out.println("Missing Number: "+missing);

        int mising = findMissingNumberByCounting(arr);
        System.out.println("Mising Number: "+mising);

        int xorMis = findMissingNumberUsingXOR(arr);
        System.out.println("Missing Number: "+xorMis);

        int hashSetMissing = findMissingNumberUsingSet(arr);
        System.out.println("Missing Number: "+hashSetMissing);
    }

}