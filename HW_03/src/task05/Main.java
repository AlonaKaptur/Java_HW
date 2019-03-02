package task05;

public class Main {
    public static void main(String[] args) {
        int stars = 1;
        int spaces = 5;
        printFigure(stars, spaces);
        printFigure(stars, spaces);
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

    private static void printFigure(int stars, int spaces) {
        while (spaces > 0) {
            printSpaces(spaces);
            printStars(stars);
            printSpaces(spaces);
            stars += 2;
            spaces--;
            System.out.println();
        }
    }
}
