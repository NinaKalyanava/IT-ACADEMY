package homework9;

import java.util.NoSuchElementException;

public class HomeWork9Task2 {
    public static void main(String[] args) {

    }
}

class Iterator<T> {

    private T[][] array;

    public Iterator(T[][] array) {
        this.array = array;
    }

    public T[][] getArray() {

        return array;
    }

    private int i, j;

    public boolean hasNext() {
        for (int i = this.i; i < array.length; i++) {
            for (int j = this.j; j < array[i].length; j++) {
                return true;
            }
        }
        return false;
    }

    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T t = array[i][j];
        j++;
        for (int i = this.i; i < array.length; i++) {
            for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
                this.i = i;
                this.j = j;
                return t;
            }
        }
        return t;
    }
}