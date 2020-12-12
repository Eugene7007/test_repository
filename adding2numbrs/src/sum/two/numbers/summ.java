package sum.two.numbers;

public class summ {
    private int number1;
    private int number2;

    public summ(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sumOfTwoNumbers() {
        int sum = 0;
        sum = number1 + number2;
        if (sum < 100) {
            System.out.println("Sum = " + sum);
        } else {
            throw new ArithmeticException("Sum can more than 100!");
        }
    }
}