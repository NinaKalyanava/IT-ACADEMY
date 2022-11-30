package homeWork5;

public class HomeWork5Task3 {
    public static void main(final String[] args) {
        int[] array1 = {2, 4, 5, 10, 21};
        int[] array2 = {3, 7, 8, 12, 20};

        int[] newArray = new int[array1.length + array2.length];
        int indexOfNewArray = 0;

        for (int indexOfFirstArray = 0, indexOfSecondArray = 0; indexOfSecondArray < array2.length && indexOfFirstArray<array1.length; ) {
            if (array1[indexOfFirstArray] < array2[indexOfSecondArray]) {
                newArray[indexOfNewArray] = array1[indexOfFirstArray];
                indexOfFirstArray++;
            } else {
                newArray[indexOfNewArray] = array2[indexOfSecondArray];
                newArray[indexOfNewArray + 1] = array1[indexOfFirstArray];
                indexOfSecondArray++;
            }
            indexOfNewArray++;
        }

        for (int newIndex = 0; newIndex < 10; newIndex++) {
            System.out.print(newArray[newIndex] + " ");
        }
    }
}