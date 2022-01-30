
import java.lang.reflect.Array;
import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {

        //4. Write a Java program to remove a specific element from an array
        System.out.println("");
        int [] intArray = {2,4,6,8,10};
        int indexTobeRemoved = 3;
        int [] newIntArray = new int[intArray.length-1];
        System.out.println("Original Array: "+ Arrays.toString(intArray));


        for(int i = 0, k = 0;i<intArray.length;i++ )
        {
            if(i==indexTobeRemoved)
            {
                continue;
            }
            newIntArray[k++] = intArray[i];
        }
        System.out.println("New Array after removing the element: " + Arrays.toString(newIntArray));
    }

}
