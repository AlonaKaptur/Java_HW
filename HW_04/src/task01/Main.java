package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input string: ");
        String line = input();
        String unique = getStringWithUniqueSymbols(line);
        System.out.println("Your string " + line + " contains " + unique + " unique symbols");
    }

    private static String getStringWithUniqueSymbols(String line) {
        String unique = "";

        for (int i = 0; i < line.length(); i++) {
            if (!unique.contains(String.valueOf(line.charAt(i)))) {
                unique = unique.concat(String.valueOf(line.charAt(i)));
            }
        }
        return unique;
    }

    private static String input() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}