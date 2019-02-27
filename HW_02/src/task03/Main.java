package task03;

public class Main {
    public static void main(String[] args) {
        double pound = 25.6;
        double kilograms = pound * 0.453;
        int grams = (int) (kilograms * 1000) - (int) kilograms * 1000;

        System.out.println("In " + pound + " pound(s) " + (int) kilograms + " kilo and " + grams + " grams");
    }
}
