import java.util.Scanner;

public class HomeWork3Task4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of seconds: ");
        int number = scanner.nextInt();

        int sec = number % 60;
        int min = number / 60 % 60;
        int hr = number / 3600;

        System.out.println("There is  " + hr + " hours, " + min + " minutes, " + sec + " seconds in number.");

        scanner.close();
    }
}