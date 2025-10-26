package br.com.carlos.algoritmos.java.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        var values = new int[]{2, 4, 6, 10, 15, 20, 25};
        var selectedNumber = 10;
        var position = binarySearch(values, selectedNumber);
        System.out.println("The position of " + selectedNumber + " is " + position);
    }

    /*
        The input is a list in order and a value which will be search
        The response is the position of the number that was found.
     */
    public static Object binarySearch(int[] array, int selectedValue) {

        var posInitial = 0;
        var posFinal = array.length;
        while (posInitial <= posFinal) {

            var posMeio = (posInitial + posFinal)  / 2;

            if (selectedValue == array[posMeio]) {
                return posMeio;
            }

            if (selectedValue < array[posMeio]) {
                posFinal = posMeio - 1;
            } else {
                posInitial = posMeio + 1;
            }
        }

        return null;
    }
}
