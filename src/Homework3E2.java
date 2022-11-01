import java.util.Scanner;

public class Homework3E2 {

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