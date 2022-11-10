package homeWork3;

import java.util.Scanner;

public class HomeWork3Task5 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day: ");
        int day = scanner.nextInt();

        System.out.println("Enter a month: ");
        int month = scanner.nextInt();

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (day == 28 && month == 2 && year % 4 == 0) {
            System.out.println("29 Feb " + year);
        } else if (day == 29 && month == 2 && year % 4 == 0) {
            System.out.println("1 Mar " + year);
        } else if (day == 29 && month == 2 && year % 4 != 0) {
            System.out.println("29 Feb didn't exist this year");
        } else if (day == 31 && month == 12) {
            year += 1;
            System.out.println("1 Jan " + year);
        } else if (day == 31 && month == 1) {
            System.out.println("1 Feb " + year);
        } else if (day == 28 && month == 2) {
            System.out.println("1 Mar " + year);
        } else if (day == 31 && month == 3) {
            System.out.println("1 Apr " + year);
        } else if (day == 30 && month == 4) {
            System.out.println("1 May " + year);
        } else if (day == 31 && month == 5) {
            System.out.println("1 Jun " + year);
        } else if (day == 30 && month == 6) {
            System.out.println("1 Jyl " + year);
        } else if (day == 31 && month == 7) {
            System.out.println("1 Aug " + year);
        } else if (day == 31 && month == 8) {
            System.out.println("1 Sep " + year);
        } else if (day == 30 && month == 9) {
            System.out.println("1 Okt " + year);
        } else if (day == 31 && month == 10) {
            System.out.println("1 Nov " + year);
        } else if (day == 30 && month == 11) {
            System.out.println("1 Dec " + year);
        } else {
            day += 1;
            switch (month) {
                case 1:
                    System.out.println(day + " Jan " + year);
                    break;
                case 2:
                    System.out.println(day + " Feb " + year);
                    break;
                case 3:
                    System.out.println(day + " Mar " + year);
                    break;
                case 4:
                    System.out.println(day + " Apr " + year);
                    break;
                case 5:
                    System.out.println(day + " May " + year);
                    break;
                case 6:
                    System.out.println(day + " Jun " + year);
                    break;
                case 7:
                    System.out.println(day + " Jul " + year);
                    break;
                case 8:
                    System.out.println(day + " Aug " + year);
                    break;
                case 9:
                    System.out.println(day + " Sep " + year);
                    break;
                case 10:
                    System.out.println(day + " Okt " + year);
                    break;
                case 11:
                    System.out.println(day + " Nov " + year);
                    break;
                case 12:
                    System.out.println(day + " Dec " + year);
                    break;
            }
        }
        scanner.close();
    }
}