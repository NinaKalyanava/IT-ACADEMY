package homework2;

import java.util.Scanner;

public class HomeWork2Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural three-digit number: ");
        int n = scanner.nextInt();

        int hundreds = n / 100;
        int dozens = (n % 100)/10 ;
        int units = n % 10;
        int summ = hundreds + dozens + units;

        System.out.println("The summ of hundreds, dozens and units is " + summ);

        scanner.close();
    }
}