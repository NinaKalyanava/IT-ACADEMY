package homework11;

import java.util.Scanner;

public class HomeWork11Task1 {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
        System.out.println(randomNumber);
        askNumber(randomNumber);

    }

    public static void askNumber(int randomNumber) {

        System.out.println("Enter the number from 1 to 100, please.");
        Scanner scanner = new Scanner(System.in);
        int customNumber = scanner.nextInt();

        try {
            if (customNumber < 1 || customNumber > 100) {
                throw new Exception();
            }
            checkNumber(randomNumber, customNumber);
        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println("Incorrect number!");
            askNumber(randomNumber);
        }

    }

    public static void checkNumber(int randomNumber, int customNumber) {

        if (randomNumber > customNumber) {
            System.out.println("Try again! Your number is less, than random number.");
            askNumber(randomNumber);

        } else if (randomNumber < customNumber) {
            System.out.println("Try again! Your number is more, than random number.");
            askNumber(randomNumber);

        } else {
            System.out.println("Congratulations! You guessed!");
        }
    }
}




