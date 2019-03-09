package task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input string: ");
        int i = input();
        String s = convertToBinary(i);
        System.out.println(s);
    }

    private static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static String convertToBinary(int number) {
        String result = "";
        while (number >= 1) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }
}

