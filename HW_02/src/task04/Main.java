package task04;

public class Main {
    public static void main(String[] args) {
        double deposit = 10000.0;
        int period = 100;
        double percent = 10;
        double profit = calculateProfit(deposit, period, percent);
        System.out.printf("Your profit will be: %.2f", profit);
    }

    private static double calculateProfit(double deposit, int depositDuration, double percent) {
        return (deposit * percent * depositDuration) / (365 * 100);
    }
}
