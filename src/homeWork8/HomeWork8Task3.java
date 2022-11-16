package homeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork8Task3 {
    public static void main(String[] args) {
        String str = "Listen to the news from today, read the text at the same time! Listen to the news from today - without reading the text.";
        Pattern pattern = Pattern.compile("[-.,!]");
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println("Total number of punctuation marks is " + counter);
    }
}
