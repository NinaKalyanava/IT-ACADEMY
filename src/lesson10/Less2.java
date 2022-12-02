package lesson10;

public class Less2 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[2];
        Container<Integer> integerContainer = new Container<>(integers);

        System.out.println("integerContainer.getNumberOfElements() = " + integerContainer.getNumberOfElements());

        Boolean[] booleans = new Boolean[2];
        Container<Boolean> booleanContainer = new Container<>(booleans);

        System.out.println("booleanContainer.getNumberOfElements() = " + booleanContainer.getNumberOfElements());

        boolean added = integerContainer.addItem(4, 1);
        System.out.println("added = " + added);

        int foundIndex = integerContainer.findIndex(4);
        System.out.println("foundIndex = " + foundIndex);
    }
}

class Container<T> {
    private final T[] array;

    public Container(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public int getNumberOfElements() {
        return array.length;
    }

    public boolean addItem(T item, int index) {
        if (index >= 0 && array.length > index) {
            array[index] = item;
            return true;
        }
        return false;
    }

    public int findIndex(T item) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == item) {
                return index;
            }
        }
        return -1;
    }

}
