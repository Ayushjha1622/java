import java.util.*;
public class delete {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Find the index of the element to remove
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // If the element is found, remove it
        if (indexToRemove != -1) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != indexToRemove) {
                    newArray[j++] = array[i];
                }
            }
            array = newArray;
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
        } else {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        }
    }
}
