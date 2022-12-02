package homework3;

import java.util.Scanner;

public class HomeWork3Task2 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("This is even number!");
        } else {
            System.out.println("This is odd number!");
        }
        scanner.close();
    }
}