import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();
            System.out.println("Choose operation:+,-,*,/");
            char op = sc.next().charAt(0);

            double result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("Cannot divided by Zero!");
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
            System.out.println("Result:" + result);

            System.out.println("Do you want to continue ? (y/n)");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'Y');

        sc.close();
        System.out.println("calculator closed.");
    }
}