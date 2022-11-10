package homeWork2;

import java.util.Scanner;

public class HomeWork2Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural two-digit number: ");
        int n = scanner.nextInt();

        int dozens = n / 10;
        int units = n % 10;
        int summ = dozens + units;

        System.out.println("The summ of dozens and units is " + summ);

        scanner.close();
    }
}