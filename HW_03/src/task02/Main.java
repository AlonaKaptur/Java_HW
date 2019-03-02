package task02;

public class Main {
    public static void main(String[] args) {
        int stars = 5;
        int spaces = 1;
        while (stars > 0) {
            printSpaces(spaces);
            printStars(stars);
            stars--;
            spaces++;
            System.out.println();
        }
    }

    private static void printStars(int count) {
        while (count > 0) {
            System.out.print("* ");
            count--;
        }
    }

    private static void printSpaces(int count) {
        while (count > 0) {
            System.out.print("  ");
            count--;
        }
    }
}