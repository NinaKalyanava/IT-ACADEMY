package HomeWork4;

public class HomeWork4Task4 {

    public static void main(final String[] args) {

        int counter = 0;

        for (int i = 0; i < 99999; i++) {
            int n = i;
            while (n > 0) {
                if (n % 10 == 4 || ((n / 10) % 10 == 1) && n % 10 == 3) {
                    counter++;
                    break;
                }
                n /= 10;
            }
        }
        System.out.println("Amount of numbers: " + counter);
    }
}