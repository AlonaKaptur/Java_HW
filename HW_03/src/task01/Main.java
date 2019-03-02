package task01;

public class Main {
    public static void main(String[] args) {
        int stars = 1;
        int spaces = 5;
        while (spaces > 0) {
            printStars(stars);
            printSpaces(spaces);
            spaces--;
            stars++;
            System.out.println();
        }
        while (stars > 0) {
            printStars(stars);
            printSpaces(spaces);
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