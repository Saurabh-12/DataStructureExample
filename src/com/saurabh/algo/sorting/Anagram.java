package com.saurabh.algo.sorting;

public class Anagram {
    
    public static int size;
    public static char [] arrChar = new char[100];

    public static void main(String[] args) {
        //System.out.println("ddddddd");
        String cat = "cat";
        size = cat.length();
        for (int i = 0; i < size; i++) {
            arrChar[i] = cat.charAt(i);
        }

        doAnagram(size);
        //displayAnagram();
    }

    public static void doAnagram(int newSize) {

        if(newSize ==1)
            return;

        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);
            if(newSize == 2)
                displayAnagram();
          rotateAnagram(newSize);
        }
    }

    private static void displayAnagram() {
        System.out.println("      ");
        for (int i = 0; i < size; i++) {
            System.out.print(""+arrChar[i]+"");
        }
        System.out.println("        ");
    }

    private static void rotateAnagram(int newSize) {
        int j;
        int pos = size - newSize;
        char temp = arrChar[pos];

        for (j = pos+1; j < size; j++) {
            arrChar[j-1] = arrChar[j];
            //arrChar[j-1] = temp;
        }

        arrChar[j-1] = temp;
    }


    
    
}
