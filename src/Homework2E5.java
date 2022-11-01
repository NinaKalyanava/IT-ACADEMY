import java.util.Scanner;

public class Homework2E5 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a four-digit number: ");
        int number = scanner.nextInt();

        int firstTwoDigits = number / 100;
        int secontTwoDigits = number % 100;
        int summ = firstTwoDigits + secontTwoDigits;

        System.out.println("The summ of the first two digits and the secont two digits is " + summ);

        scanner.close();
    }
}