package com.saurabh.algo.sorting;

public class PowerCalculate {
    
    public static void main(String[] args) {
        System.out.println(" ");
        int x = 2;
        int y = 6;
        System.out.println(x+"^"+y+" = "+calculatePower(x, y));

        System.out.println("Using Recursion   ");
        
        System.out.println(x+"^"+y+" = "+calculatePowerUsingRecursion(x, y));

        System.out.println("Using Divid and Conqure   ");
        System.out.println(x+"^"+y+" = "+power(x, y));
    }

    public static int calculatePower(int x, int y) {
        int result = 1;
        if( x == 0)
           return 0;
        if( y == 0)
           return 1;
        for (int i = 0; i < y; i++) {
            result = result *x;
        }
        return result;
    }

    // calculate poer using recusion 
    public static int calculatePowerUsingRecursion(int x, int y) {
        if( x == 0)
           return 0;
        if( y == 0)
           return 1;
        return x * calculatePowerUsingRecursion(x, y-1);
    }

    //Divide and conqure 
    public static int power(int x, int y) {
        if (y == 0)
           return 1;
        else if (y % 2 == 0)
          return power(x, y/2) * power(x, y/2);
        else 
          return x * power(x, y/2) * power(x, y/2);
          
    }
}
