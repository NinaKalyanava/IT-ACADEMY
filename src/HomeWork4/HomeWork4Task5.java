package HomeWork4;

public class HomeWork4Task5 {
    public static void main(final String[] args) {

        int counter = 0;
        int hr = 0;
        int min = 0;
        int hr1 = 0;
        int hr2 = 0;
        int min1 = 0;
        int min2 = 0;


        for (hr = 0; hr < 24; hr++) {
            for (min = 0; min < 60; min++) {
                hr1 = hr / 10;
                hr2 = hr % 10;
                min1 = min / 10;
                min2 = min % 10;
                if (hr1 == min2 && hr2 == min1) {
                    counter += 1;
                }
            }
        }
        System.out.println("The number of symmetries is " + counter);
    }
}