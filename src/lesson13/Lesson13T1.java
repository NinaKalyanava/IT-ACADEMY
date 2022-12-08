package lesson13;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lesson13T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please type file name:");
            String enteredFileName = scanner.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(enteredFileName, StandardCharsets.UTF_8), 512)) {
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }

                    System.out.println("line = " + line);
                }
                break;
            } catch (FileNotFoundException ex) {
                System.out.println("File " + enteredFileName + " does not exist.");
            } catch (IOException ex) {
                System.out.println("Something went wrong.");
                ex.printStackTrace();
                break;
            }
        }

        scanner.close();
    }
}