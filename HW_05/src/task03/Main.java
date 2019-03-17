package task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayOne = createArray(8);
        int [] arrayTwo = createArray(8);
        int [] sumOfArrays = getSumOfArrays(arrayOne,arrayTwo);
        System.out.println("Elements of arrayOne: " + Arrays.toString(arrayOne));
        System.out.println("Elements of arrayTwo: " + Arrays.toString(arrayTwo));
        System.out.println("Sum of arrays: " + Arrays.toString(sumOfArrays));
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static int[] getSumOfArrays (int[] arrayOne, int[] arrayTwo){
        int [] sumOfArrays = new int [arrayOne.length];
        for (int i = 0; i < arrayOne.length; i++) {
            sumOfArrays[i] = arrayOne[i] + arrayTwo[i];
        }
        return sumOfArrays;
    }
}