package homework6;

public class Fraction {
    int numerator;
    int denominator;

    int totalNumerator;
    int totalDenominator;
    double newNumerator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void division() {
        System.out.println("Division = " + numerator + "/" + denominator);
    }

    void additionOfFractions(int theSecondNumerator, int theSecondDenominator) {
        totalNumerator = numerator * theSecondDenominator + theSecondNumerator * denominator;
        totalDenominator = denominator * theSecondDenominator;
        System.out.println("Addition of fractions = " + totalNumerator + "/" + totalDenominator);
    }

    void fractionalMultiplication(double fractionNumberForNumerator) {
        newNumerator = totalNumerator * fractionNumberForNumerator;
        System.out.println("Result of multiplying by a fractional number is " + newNumerator + "/" + totalDenominator);
    }

    void fractionalDivision(double fractionNumberForDenominator) {
        double newDenominator = totalDenominator * fractionNumberForDenominator;
        System.out.println("Result of division by a fractional number is " + newNumerator + "/" + newDenominator);
    }
}
