package HomeWork5;

public class HomeWork5Task3 {
    public static void main(final String[] args) {
        int[] array1 = {2, 4, 5, 10, 21};
        int[] array2 = {3, 7, 8, 12, 20};

        int[] newArray = new int[array1.length + array2.length];
        int index3 = newArray[0];

        for (int index1 = 0; index1 < array1.length; index1++) {
            for (int index2 = 0; index2 < array2.length; ) {
                if (array1[index1] < array2[index2]) {
                    newArray[index3] = array1[index1];
                    index1++;
                } else if (array1[index1] > array2[index2]) {
                    newArray[index3] = array2[index2];
                    newArray[index3 + 1] = array1[index1];
                    index2++;
                }
                index3++;
            }
            for (int newIndex = 0; newIndex < 10; newIndex++) {
                System.out.print(newArray[newIndex] + " ");
            }
        }
    }
}