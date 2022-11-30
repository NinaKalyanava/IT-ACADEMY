package homeWork4;

public class HomeWork4Task4 {

    public static void main(final String[] args) {
        int counter = 0;

        for (int i = 1; i < 99999; i++) {
            for (int n = i; n != 0; n /= 10) {
                if (n % 10 == 4 || n % 100 == 13) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Amount of numbers: " + counter);
    }
}