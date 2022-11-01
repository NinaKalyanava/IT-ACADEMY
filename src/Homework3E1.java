import java.util.Scanner;

public class Homework3E1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        double number3 = scanner.nextInt();

        double averageNumber = (number1 + number2 + number3)/3;

        System.out.println("The average number is " + averageNumber);

        scanner.close();
    }
}