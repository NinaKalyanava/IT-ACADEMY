package homework9;

import java.util.Random;

public class HomeWork9Task2 {
    public static void main(String[] args) {
        Integer[][] array = new Integer[5][5];

        Random random = new Random();
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array.length; columnIndex++) {
                int randomInt = random.nextInt(10);
                array[rowIndex][columnIndex] = randomInt;
                System.out.print(randomInt + " ");
            }
            System.out.println();
        }

        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);

        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + "\s");
        }
    }
}

interface Iterator<T> {
    T next();

    boolean hasNext();
}

class ArrayIterator<T> implements Iterator<T> {

    final private T[][] array;
    private int row;
    private int col;

    public ArrayIterator(T[][] array) {
        this.array = array;
    }

    public T[][] getArray() {
        return array;
    }

    @Override
    public boolean hasNext() {
        return row < array.length && col < array[row].length;
    }

    @Override
    public T next() {
        T element = array[row][col];
        if (col < array[row].length-1) {
            col++;
        } else {
            col = 0;
            row++;
        }
        return element;
    }
}