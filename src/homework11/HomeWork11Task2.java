package homework11;

public class HomeWork11Task2 {
    public static void main(String[] args) {
        try {
            int result = divide(5, 0);
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Can't divide by zero!");
        } catch (InputException ex) {
            ex.printStackTrace();
            System.out.println("Use only numbers!");
        }
    }

    private static Integer divide(Integer a, Integer b) throws InputException {
        try {
            return a / b;
        } catch (NullPointerException ex) {
            String errorMessage = String.format("Failed to divide [%s] / [%s]", a, b);
            throw new InputException(errorMessage, ex);
        }
    }
}

class InputException extends Exception {

    public InputException(String message) {
        super(message);
    }

    public InputException(String message, Throwable cause) {
        super(message, cause);
    }
}

