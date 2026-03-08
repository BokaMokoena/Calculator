import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Read from keyboard
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Boolean operator with while loop to keep the code running
        boolean running = true;

        while (running) {

            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting calculator...");
                running = false;
                break;
            }

            //user input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            //read user input and perform the called operator
            if (choice == 1) {
                result = calculator.add(num1, num2);
            }
            else if (choice == 2) {
                result = calculator.subtract(num1, num2);
            }
            else if (choice == 3) {
                result = calculator.multiply(num1, num2);
            }
            else if (choice == 4) {
                try {
                    result = calculator.divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }
            else {
                System.out.println("Invalid option");
                continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}