package homework11;

public class HomeWork11Task2 implements Division {
    public static void main(String[] args) {
        try {
            int result = Division.divide(5, 0);
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Can't divide by zero!");
        } catch (InputException ex) {
            ex.printStackTrace();
            System.out.println("Use only numbers!");
        }
    }
}

interface Division {

    public static int divide(int a, int b) throws InputException {
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
