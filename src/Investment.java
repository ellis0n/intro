public class Investment {
    public static void main(String[] args) {

        // Initialize variables with doubles for fractional precision
        double investment = 1000.0;
        double interestRate = 0.05;
        double currentAmount;

        for (int i = 1; i <= 10; i++) {
            currentAmount = investment + (investment * interestRate);
            investment = currentAmount;
            System.out.println("Year " + i + ": $" + currentAmount);
        }
    }
}
