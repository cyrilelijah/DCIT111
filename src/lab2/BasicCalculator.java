package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cyrilelijahaurino
 */
public class BasicCalculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        float num1 = 0;
        float num2 = 0;
        char op = '0';
        System.out.println("Basic calculator: ");
        do {
            System.out.println("Press '+' for add");
            System.out.println("Press '-' for sub");
            System.out.println("Press '*' for mul");
            System.out.println("Press '/' for div");
            System.out.println("Press 'x' to exit");
            System.out.println("Enter first number: ");
            input = reader.readLine();
            try {
                num1 = Float.parseFloat(input);
            } catch (NumberFormatException ex) {
                if (input.charAt(0) == 'x') {
                    System.exit(0);
                } else {
                    System.out.println("Invalid number, number will be set to 0.");
                    num1 = 0;
                }
            }
            System.out.println("Enter second number: ");
            input = reader.readLine();
            try {
                num2 = Float.parseFloat(input);
            } catch (NumberFormatException ex) {
                if (input.charAt(0) == 'x') {
                    System.exit(0);
                } else {
                    System.out.println("Invalid number, number will be set to 0.");
                    num2 = 0;
                }
            }
            System.out.println("Enter operator:");
            input = reader.readLine();
            op = input.charAt(0);
            answer(num1, op, num2);
        } while (op != 'x');
    }

    private static void answer(float num1, char op, float num2) {
        float answer = 0;
        switch (op) {
            case '+':
                answer = num1 + num2;
                checkAnswer(answer);
                break;
            case '-':
                answer = num1 - num2;
                checkAnswer(answer);
                break;
            case '*':
                answer = num1 * num2;  
                checkAnswer(answer);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("You cannot divide number by zero.");
                } else {
                    answer = num1 / num2;
                    checkAnswer(answer);
                }
                break;
            case 'x':
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
 
    private static void checkAnswer(float answer) {
        if (answer % 1 == 0) {
            System.out.println("Answer: " + String.valueOf((int) answer));
        } else {
            System.out.printf("Answer: %.2f\n", answer);
        }
    }
}













