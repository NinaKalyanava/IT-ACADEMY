package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public static void main(String[] args) {
        String value = "test test test message messaging";

        Pattern pattern = Pattern.compile("e");
        Matcher matcher = pattern.matcher(value);

        int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println("index = " + matcher.start());
        }
        System.out.println(counter);
    }
}


