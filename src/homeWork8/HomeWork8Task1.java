package homeWork8;

import java.util.Scanner;

public class HomeWork8Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.nextLine();

        str = str.startsWith("abc") ? "www" + str.substring(3) : str + "ttt";

        System.out.println("New string is: " + str);
        scanner.close();
    }
}
