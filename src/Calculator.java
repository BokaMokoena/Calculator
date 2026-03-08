public class Calculator {

    //Arethmetic functions to make the calculations

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {

        if (secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return firstNumber / secondNumber;
    }
}