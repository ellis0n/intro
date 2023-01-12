import java.util.Scanner;


public class LargestInt {

    // This program displays the largest integer among five given integers

    public static void main(String[] args) {
        // Bring in the scanner
        Scanner scanner = new Scanner(System.in);
        // create array to store 5 integers
        int[] numbers = new int[5];
        // User inputs the five integers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            // store the input in the array
            numbers[i] = scanner.nextInt();
        }
        // Create a variable to store the largest integer
        int largest = numbers[0];
        for (int i = 1; i < 5; i++) {
            // if the current integer is larger than the largest integer, replace the largest integer
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        // Print the largest integer
        System.out.println("The largest number is " + largest);
    }

}
