package HomeWork2;

import java.util.Scanner;

public class HomeWork2Task6 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a five-digit number: ");
        int number = scanner.nextInt();

        int y = number % 1000;
        int thirdDigit = y / 100;

        System.out.println("The third digit is " + thirdDigit);

        scanner.close();
    }
}