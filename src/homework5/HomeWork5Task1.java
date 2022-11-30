package homeWork5;

import java.util.Random;

public class HomeWork5Task1 {
    public static void main(final String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        int maxEvenValue = 0;
        int maxOddValue = 0;
        for (int j = 0; j < array.length; j++) {
            if (maxEvenValue <= array[j] && array[j] % 2 == 0) {
                maxEvenValue = array[j];
            } else if (maxOddValue <= array[j] && array[j] % 2 != 0) {
                maxOddValue = array[j];
            }
        }
        if (maxEvenValue != 0) {
            System.out.println("\nMax even value is " + maxEvenValue);
        } else {
            System.out.println("\nMax even value doesn't exist.");
        }
        if (maxOddValue != 0) {
            System.out.println("Max odd value is " + maxOddValue);
        } else {
            System.out.println("\nMax odd value doesn't exist.");
        }
        int maxValue = (maxEvenValue > maxOddValue) ? maxEvenValue : maxOddValue;
        System.out.println("Max value is " + maxValue);
    }
}
