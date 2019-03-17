package task04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray(20);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(getPositiveNumbers(array)));
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100) - 50);
        }
        return array;
    }

    private static int[] getPositiveNumbers(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        int[] positiveNumbers = new int[counter];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumbers[j] = array[i];
                j++;
            }
        }
        return positiveNumbers;
    }
}
