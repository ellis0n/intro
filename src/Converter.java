import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Initialize choice
        int choice;
        do {
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a decimal number: ");
                    int decimal = input.nextInt();
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println("Binary: " + binary);
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    String binaryNumber = input.next();
                    int decimalNumber = Integer.parseInt(binaryNumber,2);
                    System.out.println("Decimal: " + decimalNumber);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        } while (choice != 3);
    }
}
