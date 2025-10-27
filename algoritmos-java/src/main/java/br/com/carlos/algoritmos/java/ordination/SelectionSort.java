package br.com.carlos.algoritmos.java.ordination;

import java.util.ArrayList;

/*
    O(n²) - It needs to iterate the list with n elements n times to found the bigger element, therefore n x n = n²
 */
public class SelectionSort {

    public static void main(String[] args) {
        var unsortedList = new ArrayList<Integer>();
        unsortedList.add(1);
        unsortedList.add(5);
        unsortedList.add(9);
        unsortedList.add(2);
        unsortedList.add(20);
        unsortedList.add(3);

        System.out.print("Unsorted list: ");
        System.out.println(unsortedList);

        var sortedList = selectionSort(unsortedList);

        System.out.print("Sorted list: ");
        System.out.println(sortedList);
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> initialArray){
        var orderedList = new ArrayList<Integer>();

        var initialSize = initialArray.size();
        for (int i = 0; i < initialSize; i++) {
            var smallNumberPosition = selectSmallNumberPosition(initialArray);
            orderedList.add(initialArray.remove(smallNumberPosition));
        }

        return orderedList;
    }

    public static int selectSmallNumberPosition(ArrayList<Integer> array) {
        var smallNumber = array.getFirst();
        var smallNumberPosition = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < smallNumber) {
                smallNumber = array.get(i);
                smallNumberPosition = i;
            }
        }
        return smallNumberPosition;
    }
}
