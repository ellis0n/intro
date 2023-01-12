import java.util.Scanner;
// This is a simple calculator class
public class Calculator {
    public static void main(String[] args) {
        // Bring in the scanner
        Scanner input = new Scanner(System.in);
        // Ask the user to input the first number
        System.out.print("Enter the first operand: ");
        double operand1 = input.nextDouble();
        // Ask the user to input the second number
        System.out.print("Enter the second operand: ");
        double operand2 = input.nextDouble();
        // Ask the user to input the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = input.next();

        double result;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("The result is: " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("The result is: " + result);
                break;
            case "/":
                result = operand1 / operand2;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}
