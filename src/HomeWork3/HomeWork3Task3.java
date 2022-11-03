package HomeWork3;

import java.util.Scanner;

public class HomeWork3Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a finger number: ");
        int fingerNumber = scanner.nextInt();

        switch (fingerNumber) {
            case 1:
                System.out.println("This is thumb!");
                break;
            case 2:
                System.out.println("This is forefinger!");
                break;
            case 3:
                System.out.println("This is middle finger!");
                break;
            case 4:
                System.out.println("This is ring finger!");
                break;
            case 5:
                System.out.println("This is little finger!");
                break;
            default:
                System.out.println("Normally, a person has 5 fingers on a hand!");
        }
        scanner.close();
    }
}