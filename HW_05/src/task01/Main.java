package task01;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray(7);
        printArray(array);
        printArrayReverse(array);
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
        System.out.print("<--- The right order ");
        System.out.println();
    }


    private static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("<--- The reverse order ");
    }
}