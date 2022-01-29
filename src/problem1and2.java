import java.util.Arrays;

public class problem1and2 {
    public static void main(String[] args) {
        //1.Write a Java Program to find the average value of the array
        System.out.println("");
        int [] intArray = new int[4];
        intArray[0] = 2;
        intArray[1] = 4;
        intArray[2] = 6;
        intArray[3] = 8;
        float average = 0;
        int sum = 0;
        int x;
        System.out.println("Original Array: "+ Arrays.toString(intArray));
        System.out.println("");
        for(x = 0; x<intArray.length;x++)
        {
            sum += intArray[x];
        }
        average = sum/intArray.length;
        System.out.println("The average value of the array is " + average);
        System.out.println("");

        //2. Write a Java program to test if an array contains a specific value.
        //Assuming each element of the array is different. And the program can exit when it detects the first common element in the array.

        int specificValue = 8;
        int y;
        for(y = 0; y<intArray.length;y++)
        {
            if(specificValue==intArray[y])
            {
                System.out.println("The value exist in the array at index " + y);
                return;
            }
            else
            {
                if (y == intArray.length-1)
                {
                    System.out.println("The value does not exist in the array.");
                    return;
                }
            }
        }
        System.out.println("");
    }

}
