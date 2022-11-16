package homeWork8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork8Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.nextLine();

        while (str.startsWith(" ")) {
            str = str.substring(1);
        }
        while (str.endsWith(" ")) {
            str = str.substring(0, str.length() - 1);
        }
        str = str.replaceAll("\\s+", " ");
        System.out.println("Normalized string: " + str);

        scanner.close();
    }
}
