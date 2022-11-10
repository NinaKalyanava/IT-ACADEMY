package homeWork4;

import java.util.Scanner;

public class HomeWork4Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;

        while (number != 1) {
            factorial = factorial * number;
            number = number - 1;
        }
        System.out.println("Factorial is " + factorial);

        scanner.close();
    }
}