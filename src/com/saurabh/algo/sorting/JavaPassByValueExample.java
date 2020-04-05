package com.saurabh.algo.sorting;

/**
 * Java is always pass-by-value. 
 * Unfortunately, when we pass the value of an object, 
 * we are passing the reference to it. This is confusing to beginners.
 * 
 * In case of Array(Which is nothing but an Object), array reference is passed by value.. 
 * (Just like an object reference is passed by value)..

When you pass an array to other method, actually the reference to that array is copied..

Any changes in the content of array through that reference will affect the original array..
But changing the reference to point to a new array will not change the existing reference in original method..
 */

public class JavaPassByValueExample {

    public static void changeContent(int[] arr) {

        // If we change the content of arr.
        arr[0] = 10; // Will change the content of array in main()
    }

    public static void changeRef(int[] arr) {
        // If we change the reference
        arr = new int[2]; // Will not change the array in main()
        arr[0] = 15;
    }

    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 4;
        arr[1] = 5;

        changeContent(arr);

        System.out.println(arr[0]); // Will print 10..

        changeRef(arr);

        System.out.println(arr[0]); // Will still print 10..
                                    // Change the reference doesn't reflect change here.
    Dog aDog = new JavaPassByValueExample(). new Dog("Max");
    Dog oldDog = aDog;

    // we pass the object to foo
    foo(aDog);
    // aDog variable is still pointing to the "Max" dog when foo(...) returns
    System.out.println(aDog.getDogName().equals("Max")); // true
    System.out.println(aDog.getDogName().equals("Fifi")); // false
    System.out.println(aDog == oldDog); // true

    }

    public static void foo(Dog d) {
        System.out.println(d.getDogName().equals("Max")); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new JavaPassByValueExample().new Dog("Fifi");
        System.out.println(d.getDogName().equals("Fifi")); // true
    }

    class Dog {
        String dogName;

        public Dog(String name) {
            dogName = name;
        }

        public String getDogName() {
            return dogName;
        }

        public void setDogName(String name) {
            dogName = name;
        }
    }
}