package homework3;

import java.util.Scanner;

public class HomeWork3Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        if (a > b) {
            if (b > c) {
                System.out.println("The average number is " + b);
            } else if (b < c && a > c) {
                System.out.println("The average number is " + c);
            } else if (b < c && c > a) {
                System.out.println("The average number is " + a);
            }
        } else {
            if (a > c) {
                System.out.println("The average number is " + a);
            } else if (a < c && b > c) {
                System.out.println("The average number is " + c);
            } else if (a < c && b < c) {
                System.out.println("The average number is " + b);
            }
        }
        scanner.close();
    }
}