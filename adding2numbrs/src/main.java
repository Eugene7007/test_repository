import sum.two.numbers.summ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int number2 = scanner.nextInt();
            summ sum = new summ(number1, number2);
            sum.sumOfTwoNumbers();
        }
        catch (InputMismatchException exception){
            System.out.println("Wrong format input!");
        }
    }
}
