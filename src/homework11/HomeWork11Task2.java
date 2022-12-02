package homework11;

public class HomeWork11Task2 {
    public static void main(String[] args) {

        try {
            int result = divide(5, 0);
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Can't divide by zero!");
        } catch (ClientException ex) {
            ex.printStackTrace();
            System.out.println("Use only numbers!");

        }
    }

    private static Integer divide(Integer a, Integer b) throws ClientException {
        try {
            return a / b;
        } catch (NullPointerException ex) {
            String errorMessage = String.format("Failed to divide [%s] / [%s]", a, b);
            throw new ClientException(errorMessage, ex);

        }
    }
}

class ClientException extends Exception {

    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }
}

