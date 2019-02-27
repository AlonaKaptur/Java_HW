package task01;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        print(a, b);
        b = a + b;
        a = b - a;
        b = b - a;
        print(a, b);
    }

    private static void print(int numberOne, int numberTwo) {
        System.out.println("number one = " + numberOne + ", number two = " + numberTwo);
    }
}
