package homework9;

public class HomeWork9Task1 {
    public static void main(String[] args) {

        Pair<Integer> pair1 = new Pair<>(10, 15);
        System.out.println("The first value is: " + pair1.first());
        System.out.println("The second value is: " + pair1.last());
        System.out.println("New pare is: " + pair1.swap());
        System.out.println("After replacing the first element new pare is: " + pair1.replaceFirst(20));
        System.out.println("After replacing the second element new pare is: " + pair1.replaceSecond(30));

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

    public T swap() {
        T x = firstValue;
        firstValue = secondValue;
        secondValue = x;
        return (T) (firstValue + ", " + secondValue);
    }

    public T replaceFirst(T newFirstValue) {
        firstValue = newFirstValue;
        return (T) (newFirstValue + ", " + secondValue);
    }

    public T replaceSecond(T newSecondValue) {
        secondValue = newSecondValue;
        return (T) (firstValue + ", " + newSecondValue);
    }

}


