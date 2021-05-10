/**
 *  Java Array example
*/

class ArrayExample
{

  public static void main(String[] args) {

    //1st way to create array in Java
    int arr[];
    arr = new int[10];
    System.out.println("Printing array 1");
    printArr(arr);


    //2nd way 
    int arr1[] = new int[10];
    System.out.println("Printing array 2");
    printArr(arr1);

    //3rd way
    int arr2[] = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Printing array 3");
    printArr(arr2);

    //search for number 6 in array
    int searchResult = findElement(arr2, 6); 
    if(searchResult>=0)
       System.out.println(" Elememt 6 is on position : "+searchResult);
    else
      System.out.println("Element not found!");
    
  }

  public static void printArr(int []arr){
    for (int j = 0; j < arr.length; j++) {
    System.out.print(" "+arr[j]+", ");
    }
    System.out.println(".............................");
  }

  //find an element in array : Linear search
  public static int findElement(int arr[], int number)
  {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==number) {
        return i;
      }
    }
      return -1;
  }
}