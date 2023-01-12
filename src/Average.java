import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        double average;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while (number != -999) {
            sum += number;
            count++;
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }

        if (count > 0) {
            average = (double) sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
