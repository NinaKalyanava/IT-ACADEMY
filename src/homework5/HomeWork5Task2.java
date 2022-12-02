package homework5;

public class HomeWork5Task2 {
    public static void main(final String[] args) {
        int[] array = {3, 5, 0, 1, 1, 3, 5, 2, 2, 2, 4};
        int[] newArray = new int[array.length];
        int counter = 0;
        boolean isZeroFirst = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (array[i] == newArray[j]) {
                    if (isZeroFirst) {
                        newArray[counter] = array[i];
                        counter++;
                        isZeroFirst = false;
                    }
                    break;
                } else {
                    if (newArray.length == j + 1) {
                        newArray[counter] = array[i];
                        counter++;
                    }
                }
            }
        }

        int[] uniqueArray = new int[counter];
        for (int i = 0; i < counter; i++) {
            uniqueArray[i] = newArray[i];
        }

        System.out.print("The new array is: ");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
