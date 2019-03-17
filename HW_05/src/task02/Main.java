package task02;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray(7);
        printArray(array);
        printArray(getOddNumbersOfArray(array));
        System.out.println(countSumElementsOfArray((array)));
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] getOddNumbersOfArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[counter] = array[i];
                counter++;
            }
        }
        return result;
    }

    private static int countSumElementsOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}