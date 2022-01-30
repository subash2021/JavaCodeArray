
//5) Write a Java program to find the maximum and minimum value of an array
import java.util.Arrays;

public class maxMinofArray {

    public static void main(String[] args) {

        System.out.println("");
        int [] intArray = {2,4,6,8,10};
        System.out.println("Original Array: "+ Arrays.toString(intArray));

        //creating an object for the class maxMinofArray to call the methods.
        maxMinofArray toCallMethods = new maxMinofArray();
        //Calling the methods
        System.out.println("The maximum value of the array is: "+ toCallMethods.maxIntheArray(intArray));
        System.out.println(("The minimum value fo the array is: "+ toCallMethods.minIntArray(intArray)));
    }
    //Method to find the maximum value of an array
    public int maxIntheArray(int [] array)
    {
        int max = array[0];
        for (int i = 0; i <array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        return max;
    }
    //Method to find the minimum value of an array
    public int minIntArray(int [] array)
    {
        int min = array [0];
        for (int i = 0; i <array.length; i++)
        {
            if (min <array[i])
            {
                min = array[i];
            }
        }
        return min;
    }
}
