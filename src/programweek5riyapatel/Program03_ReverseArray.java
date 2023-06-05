package programweek5riyapatel;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Program03_ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{32, 78, 98, 68, 58, 45};
        System.out.println("Actual Array " + Arrays.toString(array));
        Program03_ReverseArray obj = new Program03_ReverseArray();
        obj.reverseAnArray(array);

    }

    public void reverseAnArray(int[] list) {

        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
