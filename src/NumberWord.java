import java.util.Scanner;

public class NumberWord {
    // This program converts a number to a word
    public static void main(String[] args) {
        // Bring in the scanner
        Scanner scanner = new Scanner(System.in);
        // Ask the user to input a number
        System.out.print("Enter a one-digit number: ");
        String input = scanner.nextLine();
        // Prevent integers longer than 1 digit
        if (input.length() != 1) {
            System.out.println("Invalid number!");
            return;
        }

        //  Convert the string input into an int
        int number = Integer.parseInt(input);
        // Create a string to store the words
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        // Reference the number to a word by indexing the array
        System.out.println(words[number]);
    }

}
