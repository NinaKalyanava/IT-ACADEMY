package HomeWork4;

public class HomeWork4Task1 {

    public static void main(final String[] args) {

        int constantFactor = 5;
        for (int variableFactor = 1; variableFactor <= 10; variableFactor++) {
            int meaning = constantFactor * variableFactor;
            System.out.println(variableFactor + "*" + constantFactor + "=" + meaning);
        }
    }
}

