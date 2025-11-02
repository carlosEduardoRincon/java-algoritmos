package br.com.carlos.algoritmos.java.ordination;

import java.util.Arrays;

/*
    Quick sort Big(O) it depends to the selected pivot.
    In the worse case, it has time execution of O(n²)
    In the middle case, it has time execution of O(n log n)
    ** remember that always have a 'c' multiplying, that it means the time constant, and sometimes this constant means a lot to the time performance
 */
public class QuickSort {
    public static void main(String[] args) {
        var values = new int[]{2, 4, 6, 10, 15, 20, 25, 0, 18, 100};
        System.out.println("Original array:");
        printArray(values);

        quicksort(values, 0, values.length - 1);

        System.out.println("Sorted array:");
        printArray(values);

    }

    public static void quicksort(int[] values, int start, int end) {
        if (start < end) {
            int pivotPosition = partition(values, start, end);
            quicksort(values, start, pivotPosition - 1); // Divide and conquer: left part of the array
            quicksort(values, pivotPosition + 1, end); // Divide and conquer: right part of the array
        }
    }

    public static int partition(int[] values, int start, int end) {
        var pivot = values[end]; // select the last number
        var pointer = start - 1; // point to the start of the array

        for (int i = start; i < end; i++) { // iterate the hole segment passed by the method
            if (values[i] <= pivot) { // if the number it was minor than the pivot, then needs to change with our pointer
                pointer++; // but first, we need to add the pointer

                swapElements(values, i, pointer); // change the position putting the lower number to left
            }
        }

        // after iterate the hole array needs to swap the pivot with the number at the center
        swapElements(values, pointer + 1, end);
        return pointer + 1;
    }

    private static void swapElements(int[] values, int first, int second) {
        var temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
