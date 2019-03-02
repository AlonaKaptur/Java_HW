package task03;

public class Main {
    public static void main(String[] args) {
        int stars = 1;
        int spaces = 7;
        while (spaces > 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
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

