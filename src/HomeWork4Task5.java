public class HomeWork4Task5 {

    public static void main(final String[] args) {

        int hr = 0;
        int min = 0;
//        int counter = 0;

        for (hr = 0; hr < 24; hr++) {
            for (min = 0; min < 60; min++) {
                System.out.print(" " + hr + ":" + min);
                if (min == 60) {
                    hr++;
                }
            }
        }
    }


//        for (hr = 0; hr < 24; hr++) {
//            for (min = 0; min < 60; min++) {
//                if (min / 10 == hr % 10 && min % 10 == hr / 10) {
//                    counter += 1;
//                    min += 1;
//                    if (min == 59) {
//                        hr += 1;
//                    }
//                }
//            }
//
//        }

}