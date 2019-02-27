package task02;

public class Main {
    public static void main(String[] args) {
        int a = 123;
        print(a);
        int b = revert(a);
        print(b);
    }

    private static int revert(int number) {
        int hundreds = number / 100;
        int dickers = (number % 100) / 10;
        int units = number % 10;
        return units * 100 + dickers * 10 + hundreds;
    }

    private static void print(int number) {
        System.out.println("Number = " + number);
    }
}
