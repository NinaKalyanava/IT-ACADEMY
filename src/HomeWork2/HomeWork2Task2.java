package HomeWork2;

import java.util.Scanner;

public class HomeWork2Task2 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first natural number: ");
        int q = scanner.nextInt();

        System.out.println("Enter the second natural number: ");
        int w = scanner.nextInt();

        int result = q / w;
        int remainder = q % w;

        System.out.println("The result of division is " + result + ", the remainder of division is " + remainder);

        scanner.close();
    }
}