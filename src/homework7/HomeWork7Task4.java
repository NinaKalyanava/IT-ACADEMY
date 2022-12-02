package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Good email!  " + email);
        } else {
            System.out.println("Email entered incorrectly. Try again.");
        }
    }
}
