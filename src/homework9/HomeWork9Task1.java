package homework9;

public class HomeWork9Task1 {
    public static void main(String[] args) {
        Pair<Integer> pair1 = new Pair<>(10, 15);
        System.out.println("The first value is: " + pair1.first());
        System.out.println("The second value is: " + pair1.last());
        pair1.swap();
        System.out.println("New pare is: " + pair1.getFirstValue() + " and " + pair1.getSecondValue());
        pair1.replaceFirst(20);
        System.out.println("After replacing the first element new pare is: " + pair1.getFirstValue() + " and " + pair1.getSecondValue());
        pair1.replaceSecond(30);
        System.out.println("After replacing the second element new pare is: " + pair1.getFirstValue() + " and " + pair1.getSecondValue());
    }
}

class Pair<T> {

    private T firstValue;
    private T secondValue;

    Pair(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public T getSecondValue() {
        return secondValue;
    }

    public T first() {
        return firstValue;
    }

    public T last() {
        return secondValue;
    }

    public void swap() {
        T x = this.firstValue;
        this.firstValue = this.secondValue;
        this.secondValue = x;
    }

    public void replaceFirst(T newFirstValue) {
        this.firstValue = newFirstValue;
    }

    public void replaceSecond(T newSecondValue) {
        this.secondValue = newSecondValue;
    }
}


