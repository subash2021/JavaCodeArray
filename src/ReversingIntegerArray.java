

//6) Write a Java program to reverse an array of integer values

import java.util.Arrays;

public class ReversingIntegerArray {
    //Method to reverse an Integer Array
    public String reversArray(int [] array)
    {
        String reverseArray;
        //I believe copying the array to a new array in reverse order is fine for this.
        int [] newArray = new int[array.length];
        for(int i = array.length-1, k = 0; i>=0;i--)
        {
            newArray [k] = array [i];
            k++;
        }
        reverseArray = Arrays.toString(newArray);
        return reverseArray;
    }
    public static void main(String[] args) {

        System.out.println("");
        int [] intArray = {2,4,6,8,10};
        System.out.println("Original Array: "+ Arrays.toString(intArray));

        //We need to create an instance of the class first to use it's methods
        ReversingIntegerArray r = new ReversingIntegerArray();
        System.out.println("Reversed Array: "+ r.reversArray(intArray));
    }
}
