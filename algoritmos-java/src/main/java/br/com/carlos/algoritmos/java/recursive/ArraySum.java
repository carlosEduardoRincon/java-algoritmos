package br.com.carlos.algoritmos.java.recursive;

public class ArraySum {
    public static void main(String[] args) {
        var values = new int[]{2, 4, 6, 10, 15, 20, 25, 0, 18, 100};
        System.out.println("Sum: " + sum(values, 0));
    }

    public static int sum(int[] array, int position)  {
        if (position >= array.length) {
            return 0;
        }
        return array[position] + sum(array, ++position);
    }
}
