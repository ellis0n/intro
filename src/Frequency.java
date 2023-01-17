import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int[] frequency = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 100 integers between 0 and 9: ");
        for (int i = 0; i < 100; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] < 0 || numbers[i] > 9) {
                System.out.println("Invalid input. Please enter an integer between 0 and 9.");
                i--;
            } else {
                frequency[numbers[i]]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " appears " + frequency[i] + " times.");
        }
    }
}
