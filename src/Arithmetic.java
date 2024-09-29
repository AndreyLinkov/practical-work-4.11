public class Arithmetic {

    private final int firstNumber;
    private final int secondNumber;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int sum() {
        return firstNumber + secondNumber;
    }

    public int multiplication() {
        return firstNumber * secondNumber;
    }

    public int maxNumber() {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int minNumber() {
        if (firstNumber > secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }
}
